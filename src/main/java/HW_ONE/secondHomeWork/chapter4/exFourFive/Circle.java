package HW_ONE.secondHomeWork.chapter4.exFourFive;

import HW_ONE.secondHomeWork.chapter4.exOneTwoThree.Point;

public class Circle extends Shape{

    private double radius;
    private Point input;

    public Circle(Point point, double radius) {
        super(point);
        this.radius = radius;
        this.input=point;
    }

    @Override
    public Point getCenter() {
        return null;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }
}
