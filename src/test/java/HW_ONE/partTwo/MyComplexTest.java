package HW_ONE.partTwo;

import junit.framework.TestCase;

import java.text.DecimalFormat;

public class MyComplexTest extends TestCase {

    private MyComplex complexOne=new MyComplex(1,1);
    public void testGetReal() {
        assertEquals(1.0,complexOne.getReal());
    }

    public void testGetImag() {
        assertEquals(1.0,complexOne.getImag());
    }

    public void testTestToString() {
        assertEquals("(1.0+i)",complexOne.toString());
        //assertEquals("(1.0-i)",new MyComplex(1,-1).toString());
        //assertEquals("(-7.0+5.0i)",new MyComplex(-7.0,5.0).toString());
        //assertEquals("(3.0-2.0i)",new MyComplex(3.0,-2.0));
    }

    public void testIsReal() {
        assertEquals(false,new MyComplex(0,-2).isReal());
    }

    public void testIsImaginary() {
        assertEquals(false,new MyComplex(-2,0).isImaginary());
    }

    public void testTestEquals() {
        assertEquals(true,new MyComplex(1,1).equals(new MyComplex(1,1)));
    }

    public void testArgument() {
        assertEquals(45.0,complexOne.argument());
    }

    public void testAdd() {
        MyComplex myComplex=new MyComplex(1,1);
        MyComplex myComplex1=new MyComplex(3,-7);
        myComplex.add(myComplex1);
        assertEquals(4.0,myComplex.getReal());
        assertEquals(-6.0,myComplex.getImag());
    }

    public void testSubtract() {
        MyComplex myComplex=new MyComplex(-4,1);
        MyComplex myComplex1=new MyComplex(12,5);
        myComplex.subtract(myComplex1);
        assertEquals(-16.0,myComplex.getReal());
        assertEquals(-4.0,myComplex.getImag());
    }

    public void testMultiply() {
        MyComplex myComplex=new MyComplex(-1,1);
        MyComplex myComplex1=new MyComplex(3,5);
        myComplex.multiply(myComplex1);
        assertEquals(-8.0,myComplex.getReal());
        assertEquals(-2.0,myComplex.getImag());

    }

    public void testDivide() {
        MyComplex myComplex=new MyComplex(2,1);
        MyComplex myComplex1=new MyComplex(2,-1);
        myComplex.divide(myComplex1);
        DecimalFormat decimalFormatReal=new DecimalFormat("#.#");
        assertEquals("0,6",decimalFormatReal.format(myComplex.getReal()));
        assertEquals("0,8",decimalFormatReal.format(myComplex.getImag()));
    }
}