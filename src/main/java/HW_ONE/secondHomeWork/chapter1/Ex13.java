package HW_ONE.secondHomeWork.chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ex13 {

    public void resultLottery(){
        ArrayList<Integer> numberList=new ArrayList<>();
        for (int i = 0; i < 49; i++) {
            numberList.add(i+1);
        }
        int[] arrayResult=new int[6];
        Random random=new Random();
        for (int i = 0; i < 6; i++) {
            int index=random.nextInt(48);
            arrayResult[i]=numberList.get(index);
            numberList.remove(index);
        }
        Arrays.sort(arrayResult);
        for (int i = 0; i < arrayResult.length; i++) {
            System.out.print(arrayResult[i]+" ");
        }
    }

    public static void main(String[] args) {
        Ex13 ex13 =new Ex13();
        ex13.resultLottery();
    }
}
