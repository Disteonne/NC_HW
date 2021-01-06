package HW_ONE.secondHomeWork.chapter4.exFourFive;

import HW_ONE.secondHomeWork.chapter4.exOneTwoThree.Point;

public class Rectangle extends Shape {

    private Point input;
    private double width;

    public Rectangle(Point point, double width) {
        super(point);
        this.width = width;
        this.input=point;
    }

    @Override
    public Point getCenter() {
        return null;
    }

    public double getWidth() {
        return width;
    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
}
