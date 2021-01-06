package HW_ONE.secondHomeWork.chapter4.exFourFive;

import HW_ONE.secondHomeWork.chapter4.exOneTwoThree.Point;

public class Line extends Shape {

    private Point pointTo;
    private Point input;

    public Line(Point point, Point pointTo) {
        super(point);
        this.pointTo = pointTo;
        this.input=point;
    }

    @Override
    public Point getCenter() {
        return null;
    }

    @Override
    protected Line clone() throws CloneNotSupportedException {
        return (Line) super.clone();
    }
}
