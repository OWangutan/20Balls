import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallPanel extends JPanel{
    Ball[] balls = new Ball[20];
    Ball newBall = new Ball();
    public BallPanel (){
        setFocusable(true);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 68){
                    newBall.moveEast();
                }
                if (e.getKeyCode() == 65){
                    newBall.moveWest();
                }
                if (e.getKeyCode() == 87){
                    newBall.moveNorth();
                }
                if (e.getKeyCode() == 83){
                    newBall.moveSouth();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        setBackground(new Color(200,200,255));
        for(int i = 0; i< balls.length; i++){
            balls[i] = new Ball();
        }
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(new Color(newBall.getr(),newBall.getg(),newBall.getb()));
        g.fillOval(newBall.getx(),newBall.gety(),newBall.getSize(),newBall.getSize());
        for(int i = 0; i < balls.length;i++){
            g.setColor(new Color(balls[i].getr(),balls[i].getg(),balls[i].getb()));
            g.fillOval(balls[i].getx(),balls[i].gety(),balls[i].getSize(),balls[i].getSize());
            balls[i].setx(balls[i].getx() + balls[i].getxSpeed());
            balls[i].sety(balls[i].gety() + balls[i].getySpeed());
            if(balls[i].getx() + balls[i].getSize() >= getWidth() || balls[i].getx() <= 0){
                balls[i].bouncex();
            }
            if(balls[i].gety() + balls[i].getSize() >= getHeight() || balls[i].gety() <= 0){
                balls[i].bouncey();
            }
            if(balls[i].gety() + balls[i].getSize() > getHeight()){
              balls[i].sety(getHeight() - balls[i].getSize());
            }
        }
        try {
            Thread.sleep(10);
        } catch(Exception e) {
            System.out.println(e);
        }
        repaint();
    }
}
