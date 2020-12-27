package HW_ONE.partOne;

import HW_ONE.firstHomeWork.partOne.MyPoint;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyPointTest{

    private MyPoint[] getMyPoints(){
        MyPoint[] points=new MyPoint[]{
                new MyPoint(1,6),
                new MyPoint(4,2),
                new MyPoint(4,3)
        };
        return points;
    }

    @Test
    public void testGetX() {
        assertEquals(1,getMyPoints()[0].getX());
    }
    @Test
    public void testGetY() {
        assertEquals(2,getMyPoints()[1].getY());
    }
    @Test
    public void testGetXY() {
        assertEquals(4,getMyPoints()[1].getXY()[0]);
    }
    @Test
    public void testDistance() {
        assertEquals(5.0,getMyPoints()[0].distance(getMyPoints()[1].getX(),getMyPoints()[1].getY()));
    }
    @Test
    public void testTestDistance() {
        assertEquals(5.0,getMyPoints()[0].distance(getMyPoints()[1]));
    }
    @Test
    public void testTestDistance1() {
        assertEquals(5.0,getMyPoints()[2].distance());
    }
}
