package HW_ONE.secondHomeWork.chapter1;

import java.util.ArrayList;

public class MagicSquareFourteen {

    public boolean magicSquare(int[][] array) {
        if (array.length != array[0].length) {
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
                sumStrHorizon=0;
            }
            for (int j = 0; j < array[0].length; j++) {
                for (int i = 0; i < array.length; i++) {
                    sumStrVertical += array[i][j];
                }
                vertical.add(sumStrHorizon);
                sumStrHorizon=0;
            }
            int result = 0;
            byte count = 0;
            for (int i = 0; i < horizon.size(); i++) {
                if (horizon.get(i) == vertical.get(i)) {
                    count++;
                    result=horizon.get(0);
                }
            }
            if (count == array.length) {
                if (sumStrDiagonalOne == sumStrDiagonalTwo & sumStrDiagonalOne == result) {
                    return true;
                } else
                    return false;
            }else
                return false;
        }
    }

        public static void main (String[]args){
            int[][] arr = new int[][]{{14, 0, 10}, {4, 8, 12}, {6, 16, 2}};
            MagicSquareFourteen square = new MagicSquareFourteen();
            System.out.print(square.magicSquare(arr));
        }
    }
