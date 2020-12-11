package HW_ONE.partTwo;

public class Main {
    public static void main(String[] args) {
        MyComplex myComplex=new MyComplex(4,4);
        System.out.println(myComplex.argument());
        System.out.println(Double.compare(0.9,0.99));//0-равны
        //1-не равны и правый меньше
        //-1 -не равны и левый меньше


        MyPolynomial myPolynomial=new MyPolynomial(1,2,3,4,5,6,7);
        System.out.println(myPolynomial);

       MyPolynomial myPolynomial1=new MyPolynomial(10,10,10,10,10,10,10,10,10,10);
       MyPolynomial myPolynomial2=myPolynomial.add(myPolynomial1);
       System.out.println(myPolynomial2);

       double[] d1={1,2,1};
       MyPolynomial a1=new MyPolynomial(d1);
       double[] d2={1,2};
       MyPolynomial a2=new MyPolynomial(d2);
       System.out.println(a1.multiply(a2));


       System.out.println(Math.sin(30*Math.PI/180));

    }
}
