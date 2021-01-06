package HW_ONE.secondHomeWork.chapter4.exFour;

import HW_ONE.secondHomeWork.chapter4.exOne.Point;

public abstract class Shape {
    private Point point;

    public Shape(Point point) {
        this.point = point;
    }
    public void moveBy(double dx, double dy){
        this.point=new Point(point.getX()+dx,point.getY()+dy);
    }

    public abstract Point getCenter();

}
