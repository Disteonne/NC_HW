package HW_ONE.secondHomeWork.chapter1;

public class DoubleToIntFive {

    public static void main(String[] args) {
        double doubleValue = 2150000000.0; // max value int: 2147483647
        int result = (int) doubleValue;
        System.out.println(result); // int will cut double to its max value
    }

}
