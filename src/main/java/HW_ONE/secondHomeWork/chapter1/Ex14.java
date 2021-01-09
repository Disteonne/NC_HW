package HW_ONE.secondHomeWork.chapter1;

import java.util.ArrayList;

public class Ex14 {

    public boolean magicSquare(int[][] array) {
        if (array.length != array[0].length) {
            System.out.println("not square");
            return false; //not square
        } else {
            int sumStrHorizon = 0;
            int sumStrVertical = 0;
            int sumStrDiagonalOne = 0;
            int sumStrDiagonalTwo = 0;
            int tmp = array.length - 1;
            ArrayList<Integer> horizon = new ArrayList<>();
            ArrayList<Integer> vertical = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    sumStrHorizon += array[i][j];
                    if (i == j) {
                        sumStrDiagonalOne += array[i][j];
                        sumStrDiagonalTwo += array[tmp][j];
                        tmp--;
                    }
                }
                horizon.add(sumStrHorizon);
                sumStrHorizon = 0;
            }
            for (int j = 0; j < array[0].length; j++) {
                for (int i = 0; i < array.length; i++) {
                    sumStrVertical += array[i][j];
                }
                vertical.add(sumStrVertical);
                sumStrVertical = 0;
            }
            byte countCompareVertic = 0;
            byte countCompareHoriz = 0;
            for (int i = 0; i < vertical.size() - 1; i++) {
                if (vertical.get(i).equals(vertical.get(i + 1)))
                    countCompareVertic++;
                if (horizon.get(i).equals(horizon.get(i + 1)))
                    countCompareHoriz++;
            }

            int result = 0;
            byte count = 0;
            for (int i = 0; i < horizon.size(); i++) {
                if (horizon.get(i).equals(vertical.get(i))) {
                    count++;
                    result = horizon.get(0);
                }
            }
            if (count == array.length & countCompareHoriz == array.length-1 & countCompareVertic == array.length-1) {
                return sumStrDiagonalOne == sumStrDiagonalTwo & sumStrDiagonalOne == result;
            } else
                return false;
        }
    }
}
