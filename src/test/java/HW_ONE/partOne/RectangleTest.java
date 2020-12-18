package HW_ONE.partOne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest{

    private Rectangle[] getRectangles(){
        Rectangle[] rectangles=new Rectangle[]{
                new Rectangle(10.0f,20.0f),
                new Rectangle(5.0f,10.0f),
                new Rectangle(4.0f,3.0f),
                new Rectangle()
        };
        return rectangles;
    }
    @Test
    public void testGetLength() {
        assertEquals(10.0f,getRectangles()[0].getLength());
    }
    @Test
    public void testSetLengthEx() {
        Assertions.assertThrows(Exception.class,()-> {getRectangles()[3].setLength(-20);
        });
    }
    @Test
    public void testGetWight() {
        assertEquals(20.0f,getRectangles()[0].getWight());
    }

    @Test
    public void testSetWightEx() {
        Assertions.assertThrows(Exception.class,()-> {getRectangles()[0].setWight(-20);
        });
    }
    @Test
    public void testSetLength() {
        try {
            Rectangle getRec= getRectangles()[1];
            getRec.setLength(20f);
            assertEquals(20f,getRec.getLength());
        }catch (Exception ex){}
    }
    @Test
    public void testGetArea() {
        assertEquals(200.0,getRectangles()[0].getArea());
    }
    @Test
    public void testGetPerimeter() {
        assertEquals(60.0,getRectangles()[0].getPerimeter());
    }
    @Test
    public void testTestToString() {
        assertEquals("Rectangle[length=10.0, wight=20.0]",getRectangles()[0].toString());
    }
    @Test
    public void testGetDiagonal() {
        assertEquals(5.0,getRectangles()[2].getDiagonal());
    }
}
