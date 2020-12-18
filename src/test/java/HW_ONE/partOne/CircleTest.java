package HW_ONE.partOne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;

public class CircleTest  {
    private  DecimalFormat decimalFormatReal=new DecimalFormat("#.#");

    private Circle[] getGood={new Circle(12.0,"10"),new Circle(),new Circle(1/(Math.sqrt(Math.PI)),"1"),new Circle(1/Math.PI,"1")};
    private Circle[] getWrong={new Circle(0,"12"),new Circle(-10,"1"),new Circle()};


    @Test
    public void testGetRadius() {
        assertEquals(12.0,getGood[0].getRadius());

    }
    @Test
    public void testSetRadiusExceptionOne() {
        Assertions.assertThrows(Exception.class, () -> {
            getWrong[3].setRadius(-20);
        });
    }

    @Test
    public void testGetColor() {
        assertEquals("10",getGood[0].getColor());
    }
    @Test
    public void testSetRadius() {
        getGood[1].setRadius(30.0);
        assertEquals(30.0,getGood[1].getRadius());
    }
    @Test
    public void testSetColor() {
        getGood[1].setColor("21");
        assertEquals("21",getGood[1].getColor());
    }
    @Test
    public void testTestToString() {
        assertEquals("Circle[radius=12.0, color=10]",getGood[0].toString());
    }
    @Test
    public void testGetArea() {
        assertEquals("1",decimalFormatReal.format(getGood[2].getArea()));
    }
    @Test
    public void testGetLengthCircle() {
        assertEquals(2.0,getGood[3].getLengthCircle());
    }
    @Test
    public void testGetArcLength() {
        assertEquals(1.0,getGood[3].getArcLength(180));
    }
    @Test
    public void testGerAreaSector() {
        assertEquals("1",decimalFormatReal.format(getGood[2].gerAreaSector(360)));
    }
}

