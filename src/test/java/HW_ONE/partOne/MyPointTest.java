package HW_ONE.partOne;

import junit.framework.TestCase;

public class MyPointTest extends TestCase {
    private MyPoint pointOne=new MyPoint(1,6);
    private MyPoint pointTwo=new MyPoint(4,2);

    public void testGetX() {
        assertEquals(1,pointOne.getX());
    }

    public void testGetY() {
        assertEquals(2,pointTwo.getY());
    }

    public void testGetXY() {
        int[] points=pointTwo.getXY();
        assertEquals(4,points[0]);
    }

    public void testDistance() {
        assertEquals(5.0,pointOne.distance(4,2));
    }

    public void testTestDistance() {
        assertEquals(5.0,pointOne.distance(pointTwo));
    }

    public void testTestDistance1() {
        MyPoint pointThree=new MyPoint(4,3);
        assertEquals(5.0,pointThree.distance());
    }
}