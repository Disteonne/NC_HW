package HW_ONE.secondHomeWork.chapter1;

import java.math.BigInteger;

public class Ex6 {
    private static BigInteger factorialResult;

    public static BigInteger factorial(int value) throws Exception {
        if(value==0 || value==1){
            return new BigInteger("1");
        }else {
            factorialResult=new BigInteger(String.valueOf(value));
            return  factorialResult.multiply(factorial(value-1));
        }
    }
}
