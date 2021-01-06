package HW_ONE.secondHomeWork.chapter4.exFour;

import HW_ONE.secondHomeWork.chapter4.exOne.Point;

public class Rectangle extends Shape {

    private double width;

    public Rectangle(Point point, double width) {
        super(point);
        this.width = width;
    }

    @Override
    public Point getCenter() {
        return null;
    }

    public double getWidth() {
        return width;
    }
}
