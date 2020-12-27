package HW_ONE.secondHomeWork.chapter1;

public class MinMaxDoubleFour {

    public static double getMin(double valuesOne,double valuesTwo){
        int compare=Double.compare(Math.nextUp(valuesOne),Math.nextUp(valuesTwo));
        if (compare==1){
            return valuesTwo;
        }else
            return valuesOne;
    }

    public static double getMax(double valuesOne,double valuesTwo){
        int compare=Double.compare(Math.nextUp(valuesOne),Math.nextUp(valuesTwo));
        if (compare==1){
            return valuesOne;
        }else
            return valuesTwo;
    }



}
