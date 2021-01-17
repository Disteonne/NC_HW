package HW_JAVA.secondHomeWork.chapter1;

public class Ex5 {

    public static void main(String[] args) {
        double doubleValue = 2150000000.0; // max value int: 2147483647
        int result = (int) doubleValue;
        System.out.println(result); // int will cut double to its max value
    }

}
