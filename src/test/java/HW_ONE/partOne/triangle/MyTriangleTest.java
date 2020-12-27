package HW_ONE.partOne.triangle;
import HW_ONE.firstHomeWork.partOne.MyPoint;

import HW_ONE.firstHomeWork.partOne.triangle.MyTriangle;
import HW_ONE.firstHomeWork.partOne.triangle.TrianglesType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyTriangleTest  {


    private MyTriangle[] getTriangle(){
        MyTriangle[] triangles=new MyTriangle[]{
                new MyTriangle(new MyPoint(-2, 0),new MyPoint(2, 0),new MyPoint(0,2)),
                new MyTriangle(0,0,0,4,-3,0)
        };
        return triangles;
    }


    @Test
    public void testTestToString() {
        assertEquals("MyTriangle[v1=(-2,0),v2=(2,0),v3=(0,2)",getTriangle()[0].toString());
    }

    @Test
    public void testGetPerimeter() {
        assertEquals(12.0,getTriangle()[1].getPerimeter());
    }
    @Test
    public void testGetTypes() {
        assertEquals(TrianglesType.Isosceles,getTriangle()[0].getTypes());
    }
}

