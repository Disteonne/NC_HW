package HW_ONE.secondHomeWork.chapter4.exFour;

import HW_ONE.secondHomeWork.chapter4.exOne.Point;

public class Circle extends Shape{

    private double radius;

    public Circle(Point point, double radius) {
        super(point);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return null;
    }

    public double getRadius() {
        return radius;
    }
}
