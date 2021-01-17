package HW_JAVA.secondHomeWork.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex3Test {

    @Test
    void getMinMax() {
        assertEquals("Max: 86,Min: -34", Ex3.getMinMax(86,13,-34));
    }

    @Test
    void getMinMaxMath() {
        assertEquals("Max: 86,Min: -34", Ex3.getMinMaxMath(86,13,-34));
    }
}