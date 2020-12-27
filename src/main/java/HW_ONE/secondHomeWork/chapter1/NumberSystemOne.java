package HW_ONE.secondHomeWork.chapter1;


public class NumberSystemOne {

    public static int number;

    public static int getNumber() {
        return number;
    }

    public static String binary(){
        //OR Integer.toBinaryString(number);
        return result(2);
    }

    public static String octal(){
        //OR Integer.toOctalString(number);
        return result(8);
    }

    public static String hexadecimal(){
        return ""+Integer.toHexString(number);
    }

    public static int reverseHex(String hexNumber){
        return Integer.parseInt(hexNumber,16);
    }

    private static String result(int systemNumber){
        StringBuilder stringBuilder=new StringBuilder();
        while (number!=0){
            stringBuilder.append(number%systemNumber);
            number/=systemNumber;
        }
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }


}
