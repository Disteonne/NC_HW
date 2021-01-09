package HW_ONE.secondHomeWork.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex2Test {
    private Ex2 ex2 =new Ex2();
    @Test
    void getDegree() {
        assertEquals(-270, ex2.getDegree(-630));
    }

    @Test
    void getDegreeFloorMood() {
        assertEquals(90, ex2.getDegreeFloorMood(-630));
    }
}