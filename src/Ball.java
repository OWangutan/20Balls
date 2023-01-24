public class Ball{
    private int x,y,size,r,g,b,xSpeed,ySpeed;

    public Ball(){
        this.x = (int)(Math.random()*400);
        this.y = (int)(Math.random()*400);
        this.size = (int)(Math.random()*90) + 10;
        this.r = (int)(Math.random()* 255);
        this.g = (int)(Math.random()* 255);
        this.b = (int)(Math.random()* 255);
        this.xSpeed = (int)(Math.random()* 10);
        this.ySpeed = (int)(Math.random()* 10);
    }
    public void moveEast(){
        x++;
    }
    public void moveNorth(){
        y--;
    }
    public void moveWest(){
        x--;
    }
    public void moveSouth(){
        y++;
    }
    public void bouncex(){
        xSpeed = -(xSpeed);
    }
    public void bouncey(){
        ySpeed = -(ySpeed);
    }
    public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }
    public int getr(){
        return r;
    }
    public int getg(){
        return g;
    }
    public int getb(){
        return b;
    }

    public int getSize(){
        return size;
    }
    public int getxSpeed(){
        return xSpeed;
    }
    public int getySpeed(){
        return ySpeed;
    }
    public void setx(int x){
        this.x = x;
    }
    public void sety(int y){
        this.y = y;
    }
}
