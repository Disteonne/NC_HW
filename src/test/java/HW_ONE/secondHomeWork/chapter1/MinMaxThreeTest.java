package HW_ONE.secondHomeWork.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxThreeTest {

    @Test
    void getMinMax() {
        assertEquals("Max: 86,Min: -34",MinMaxThree.getMinMax(86,13,-34));
    }

    @Test
    void getMinMaxMath() {
        assertEquals("Max: 86,Min: -34",MinMaxThree.getMinMaxMath(86,13,-34));
    }
}