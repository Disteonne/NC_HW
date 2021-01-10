package HW_ONE.secondHomeWork.chapter4.exFourFive;

import HW_ONE.secondHomeWork.chapter4.exOneTwoThree.Point;

public class Line extends Shape {

    private Point pointTo;
    private Point pointFrom;

    public Line(Point pointFrom, Point pointTo) {
        super(pointFrom);
        this.pointTo = pointTo;
        this.pointFrom=pointFrom;
    }

    @Override
    public Point getCenter() {
        return new Point((pointFrom.getX()+pointTo.getX())/2,(pointFrom.getY()+pointTo.getY())/2);
    }

    @Override
    protected Line clone() throws CloneNotSupportedException {
        return (Line) super.clone();
    }
}
