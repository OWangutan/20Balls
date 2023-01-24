import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] agrs){
        //commet form intellJ
        JFrame myFrame = new JFrame();
        myFrame.setSize(500,500);
        BallPanel bPanel = new BallPanel();
        myFrame.add(bPanel);

        myFrame.setVisible(true);
    }
}