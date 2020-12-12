package HW_ONE.partTwo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        if (coeffs == null) {
            throw new NullPointerException();
        }
        return coeffs.length;
    }

    double evaluate(double x){
        double result=0.0;
        for (int i = 0; i < coeffs.length; i++) {
            result+=coeffs[i]*Math.pow(x,i);
        }
        return result;
    }

    @Override
    public String toString() {
        //String result = "";
        StringBuffer result=new StringBuffer();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] == 0) {
                continue;
            } else {
                if (i != 1 && i != 0) {
                    //result += coeffs[i] > 0 ? "+" + coeffs[i] + "x^" + i : coeffs[i] + "x^" + i;
                    result.append(coeffs[i] > 0 ? "+" + coeffs[i] + "x^" + i : coeffs[i] + "x^" + i);
                }
                if (i == 1) {
                   // result += coeffs[i] > 0 ? "+" + coeffs[i] + "x" : coeffs[i] + "x";
                    result.append(coeffs[i] > 0 ? "+" + coeffs[i] + "x" : coeffs[i] + "x");
                }
                if (i == 0) {
                    //result += coeffs[i] > 0 ? "+" + coeffs[i] : coeffs[i];
                    result.append(coeffs[i] > 0 ? "+" + coeffs[i] : coeffs[i]);
                }
            }
        }
        // String loses in speed.
        String resString=result.toString();
        return resString.startsWith("+") ? resString.substring(1, resString.length()) : resString;
    }

    public MyPolynomial add(MyPolynomial right) {
        double[] newCoeffs = new double[Math.max(this.coeffs.length, right.coeffs.length)];
        boolean coeffIsMin = this.coeffs.length != newCoeffs.length;// true when coeffs is min.
        int difference = 0;
        if (coeffIsMin) {
            difference = newCoeffs.length - this.coeffs.length;
            for (int i = 0; i < this.coeffs.length; i++) {
                newCoeffs[i] = coeffs[i] + right.coeffs[i];
            }
        } else {
            difference = newCoeffs.length - right.coeffs.length;
            for (int i = 0; i < right.coeffs.length; i++) {
                newCoeffs[i] = coeffs[i] + right.coeffs[i];
            }
        }
        for (int i = newCoeffs.length - difference; i < newCoeffs.length; i++) {
            newCoeffs[i] = coeffIsMin ? right.coeffs[i]:this.coeffs[i];
        }
        return new MyPolynomial(newCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial right){
        double[] newCoeff=new double[this.coeffs.length+right.coeffs.length];
        //(a+b)(1+a+z)=a*1+a*a+a*z+b_+ba+bz
        //[2,4][0,1,2]=2*0+2*1+2*2
        //сумма индексов
        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < right.coeffs.length; j++) {
                newCoeff[i+j]+=this.coeffs[i]*right.coeffs[j];
            }
        }
        return  new MyPolynomial(newCoeff);
    }

}
