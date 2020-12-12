package HW_ONE.partOne;

import junit.framework.TestCase;
import org.junit.Test;

public class CircleTest extends TestCase {
    private Circle circleGood=new Circle(12.0,"10");
    private Circle circleWrongOne=new Circle(0,"12");
    private Circle circleWrongTwo=new Circle(-10,"1");

    @Test
    public void testGetRadius() {
        assertEquals(12.0,circleGood.getRadius());
    }
    @Test(expected = Exception.class)
    public void testGetRadiusExceptionOne() {
        new Circle(0,"12");
    }
    @Test(expected = Exception.class)
    public void testGetRadiusExceptionTwo() {
        new Circle(-10,"1");
    }
    public void testGetColor() {
        assertEquals("10",circleGood.getColor());
    }

    public void testSetRadius() {
        circleGood.setRadius(30.0);
        assertEquals(30.0,circleGood.getRadius());
    }

    public void testSetColor() {
        circleGood.setColor("21");
        assertEquals("21",circleGood.getColor());
    }

    public void testTestToString() {
        Circle newCircle=new Circle(15,"17");
        assertEquals("Circle[radius=15.0, color=17]",newCircle.toString());
    }

    public void testGetArea() {
        Circle newCircle=new Circle(1/(Math.sqrt(Math.PI)),"1");
        assertEquals(1.0,newCircle.getArea());
    }

    public void testGetLengthCircle() {
        Circle newCircle=new Circle(1/Math.PI,"1");
        assertEquals(2.0,newCircle.getLengthCircle());
    }

    public void testGetArcLength() {
        Circle newCircle=new Circle(1/Math.PI,"1");
        assertEquals(1.0,newCircle.getArcLength(180));
    }

    public void testGerAreaSector() {
        Circle newCircle=new Circle(1/(Math.sqrt(Math.PI)),"1");
        assertEquals(1.0,newCircle.gerAreaSector(360));
    }
}