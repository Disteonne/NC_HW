package HW_ONE.partOne;

import junit.framework.TestCase;
import org.junit.Test;

public class RectangleTest extends TestCase {
    Rectangle rectangle=new Rectangle(10.0f,20.0f);
    @Test
    public void testGetLength() {
        assertEquals(10.0f,rectangle.getLength());
    }
    @Test(expected = Exception.class)
    public void testGetLengthEx() {
        new Rectangle(-15f, 0f);
    }
    @Test
    public void testGetWight() {
        assertEquals(20.0f,rectangle.getWight());
    }
    @Test(expected =Exception.class)
    public void testGetWightEx() {
         new Rectangle(-15f, 0f);
    }

    public void testSetLength() {
        Rectangle rectangle=new Rectangle(5.0f,10.0f);
        try {
            rectangle.setLength(20f);
            assertEquals(20f,rectangle.getLength());
        }catch (Exception ex){}
    }

    public void testGetArea() {
        assertEquals(200.0,rectangle.getArea());
    }

    public void testGetPerimeter() {
        assertEquals(60.0,rectangle.getPerimeter());
    }

    public void testTestToString() {
        assertEquals("Rectangle[length=10.0, wight=20.0]",rectangle.toString());
    }

    public void testGetDiagonal() {
        Rectangle rectangle=new Rectangle(4.0f,3.0f);
        assertEquals(5.0,rectangle.getDiagonal());
    }
}