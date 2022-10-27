package pract_6.ex1;

public class MovableCircle extends MovablePoint implements Movable{
    private int radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed,int radius){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
        this.radius=radius;
    }

    public String toString(){
        return "Center:"+center;
    }
}
