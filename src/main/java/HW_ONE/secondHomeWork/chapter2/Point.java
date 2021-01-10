package HW_ONE.secondHomeWork.chapter2;

public final class Point {
    private double x;
    private double y;

    public Point(){
        this.x=0.0;
        this.y=0.0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double deltaX,double deltaY){
        return new Point(getX()+deltaX,getY()+deltaY);
    }
    public Point scale(double scale){
        return new Point(getX()*scale,getY()*scale);
    }

    @Override
    public String toString() {
        return "Point[" +
                "x=" + x +
                ", y=" + y +
                ']';
    }
}
