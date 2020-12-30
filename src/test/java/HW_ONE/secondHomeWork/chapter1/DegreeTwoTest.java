package HW_ONE.secondHomeWork.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DegreeTwoTest {
    private DegreeTwo degreeTwo=new DegreeTwo();
    @Test
    void getDegree() {
        assertEquals(-270,degreeTwo.getDegree(-630));
    }

    @Test
    void getDegreeFloorMood() {
        assertEquals(90,degreeTwo.getDegreeFloorMood(-630));
    }
}