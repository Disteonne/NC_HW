package HW_JAVA.secondHomeWork.chapter4.exFourFive;

import HW_JAVA.secondHomeWork.chapter4.exOneTwoThree.Point;

public class Circle extends Shape{

    private double radius;
    private Point center;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
        this.center=center;
    }

    @Override
    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }
}
