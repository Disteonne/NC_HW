package HW_ONE.firstHomeWork.partTwo;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double wight;
    private double height;

    public Container(int x, int y, int wight, int height) {
        this.x1=x;
        this.y1=y;
        this.wight=wight;
        this.height=height;
        this.x2=wight+x1;
        this.y2=height+y1;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public double getWight() {
        return wight;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Container[("+x1+","+y1+"),("+x2+","+y2+")]";
    }
    public  boolean collides(Ball ball){
        return (ball.getX() - ball.getRadius()) >= this.x1 && (ball.getY() - ball.getRadius()) >= this.y1
                && (ball.getX()+ball.getRadius())<=this.x2 && (ball.getY()+ball.getRadius())<=this.y2;
    }
}
