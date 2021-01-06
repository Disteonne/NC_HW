package HW_ONE.secondHomeWork.chapter4.exFour;

import HW_ONE.secondHomeWork.chapter4.exOne.Point;

public class Line extends Shape {

    private Point pointTo;

    public Line(Point point, Point pointTo) {
        super(point);
        this.pointTo = pointTo;
    }

    @Override
    public Point getCenter() {
        return null;
    }
}
