package HW_JAVA.secondHomeWork.chapter4.exFourFive;

import HW_JAVA.secondHomeWork.chapter4.exOneTwoThree.Point;

public class Rectangle extends Shape {

    private Point input;
    private double width;
    private double height;

    public Rectangle(Point point, double width ,double height) throws Exception {
        super(point);
        if(width<=0 | height<=0){
            throw new Exception("width/height must be >0");
        }
        this.width = width;
        this.height=height;
        this.input=point;
    }


    @Override
    public Point getCenter() {
        return new Point(width/2,height/2);
    }

    public double getWidth() {
        return width;
    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
}
