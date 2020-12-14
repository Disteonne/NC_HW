package HW_ONE.partTwo;

import junit.framework.TestCase;

public class MyPolynomialTest extends TestCase {



    public void testGetDegree() {
        assertEquals(8,getPolOne().getDegree());
    }

    public void testEvaluate() {
        assertEquals( -5.0,getPolOne().evaluate(0.0));
    }

    public void testTestToString() {
        assertEquals("3.0x^6+5.0x^4-4.0x^2-9.0x+21.0",getPolTwo().toString());
    }

    public void testAdd() {
        //double[] result={16,-7,4,-3,2,0,4,0,1};
        MyPolynomial myPolynomial=getPolOne();
        assertEquals("1.0x^8+4.0x^6+2.0x^4-3.0x^3+4.0x^2-7.0x+16.0",myPolynomial.add(getPolTwo()).toString());
    }

    public void testMultiply() {
        //double[] result={-105,87,170,-143,-93,49,58,-18,26,-18,-8,0,8,0,3};
        MyPolynomial myPolynomial=getPolOne();
        assertEquals("3.0x^14+8.0x^12-8.0x^10-18.0x^9+26.0x^8-18.0x^7+58.0x^6+49.0x^5-93.0x^4-143.0x^3+170.0x^2+87.0x-105.0",myPolynomial.multiply(getPolTwo()).toString());

    }

    private MyPolynomial getPolOne(){
        double[] coefficients={-5,2,8,-3,-3,0,1,0,1};
        return new MyPolynomial(coefficients);
    }

    private MyPolynomial getPolTwo(){
        double[] coefficients={21,-9,-4,0,5,0,3};
        return new MyPolynomial(coefficients);
    }
}