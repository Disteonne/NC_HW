package HW_JAVA.secondHomeWork.chapter2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    private Point point=new Point(3,4);

    @Test
    void getX() {
        assertEquals(3.0,point.getX());
    }

    @Test
    void getY() {
        assertEquals(4.0,point.getY());
    }

    @Test
    void translate() {
        assertEquals("Point[x=4.0, y=7.0]",point.translate(1,3).toString());
    }

    @Test
    void scale() {
        assertEquals("Point[x=1.5, y=2.0]",point.scale(0.5).toString());
    }
}