package HW_ONE.secondHomeWork.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicSquareFourteenTest {
    private int[][] arrayTrue={ {1,8,11,14},
                                {12,13,2,7},
                                {6,3,16,9 },
                                {15,10,5,4}};
    private int[][] arrayFalse={{4,9,0},{3,5,7},{8,1,6}};
    private int[][] arrayNotSquare={{4,1},{5,7},{6,9}};
    private MagicSquareFourteen magicSquare=new MagicSquareFourteen();

    @Test
    void magicSquareTrue() {
    assertTrue(magicSquare.magicSquare(arrayTrue));
    }

    @Test
    void magicSquareFalse() {
        assertFalse(magicSquare.magicSquare(arrayFalse));
    }

    @Test
    void magicSquareNotSquare() {
        assertFalse(magicSquare.magicSquare(arrayNotSquare));
    }
}