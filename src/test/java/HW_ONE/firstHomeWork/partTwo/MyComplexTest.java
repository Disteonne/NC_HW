package HW_ONE.firstHomeWork.partTwo;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.DecimalFormat;

public class MyComplexTest{

    private DecimalFormat decimalFormatReal=new DecimalFormat("#.#");
    private MyComplex complexOne=new MyComplex(1,1);

    private MyComplex[] myComplexes(){
    MyComplex[] myComplexes=new MyComplex[]{
            new MyComplex(1,1),
            new MyComplex(1,0),
            new MyComplex(),
            new MyComplex(-7.0,5.0),
            new MyComplex(0,-2),
            new MyComplex(-2,0),
            new MyComplex(3,-7),
            new MyComplex(-4,1),
            new MyComplex(12,5),
            new MyComplex(-1,1),
            new MyComplex(3,5),
            new MyComplex(2,1),
            new MyComplex(2,-1)
    };
    return myComplexes;
    }
    @Test
    public void testGetReal() {
        assertEquals(1.0,myComplexes()[0].getReal());
    }
    @Test
    public void testGetImag() {
        assertEquals(1.0,myComplexes()[0].getImag());
    }
    @Test
    public void testTestToStringOne() {
        assertEquals("(1.0+0.0i)",myComplexes()[1].toString());
    }
    @Test
    public void testTestToStringTwo(){
    assertEquals("(0.0+0.0i)",myComplexes()[2].toString());
    }
    @Test
    public void testTestToString(){
        assertEquals("(-7.0+5.0i)",myComplexes()[3].toString());
    }
    @Test
    public void testIsReal() {
        assertEquals(false,myComplexes()[4].isReal());
    }
    @Test
    public void testIsImaginary() {
        assertFalse(myComplexes()[5].isImaginary());
    }
    @Test
    public void testTestEquals() {
        assertTrue(myComplexes()[0].equals(myComplexes()[0]));
    }
    @Test
    public void testArgument() {
        assertEquals(45.0,myComplexes()[0].argument());
    }
    @Test
    public void testAddReal() {
        assertEquals(4.0,addMethod().getReal());
    }
    @Test
    public void testAddImag() {
        assertEquals(-6.0,addMethod().getImag());
    }


    @Test
    public void testSubtractReal() {
        assertEquals(-16.0,subMethod().getReal());
    }
    @Test
    public void testSubtractImag(){
        assertEquals(-4.0,subMethod().getImag());
    }
    @Test
    public void testMultiplyReal() {
        assertEquals(-8.0,multiMethod().getReal());
    }
    @Test
    public void testMultiplyImag() {
        assertEquals(-2.0,multiMethod().getImag());
    }
    @Test
    public void testDivideReal() {
        assertEquals("0,6",decimalFormatReal.format(divideMethod().getReal()));
    }
    @Test
    public void testDivideImag() {
        assertEquals("0,8",decimalFormatReal.format(divideMethod().getImag()));
    }


    private MyComplex addMethod(){
        MyComplex newComplex=myComplexes()[0];
        newComplex.add(myComplexes()[6]);
        return newComplex;
    }

    private MyComplex subMethod(){
        MyComplex newComplex=myComplexes()[7];
        newComplex.subtract(myComplexes()[8]);
        return newComplex;
    }

    private MyComplex multiMethod(){
        MyComplex newComplex=myComplexes()[9];
        newComplex.multiply(myComplexes()[10]);
        return newComplex;
    }

    private MyComplex divideMethod(){
        MyComplex newComplex=myComplexes()[11];
        newComplex.divide(myComplexes()[12]);
        return newComplex;
    }
}

