package HW_ONE.secondHomeWork.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxDoubleFourTest {

    @Test
    void getMin() {
        assertEquals(10.0,MinMaxDoubleFour.getMin(10,25));
    }

    @Test
    void getMax() {
        assertEquals(25.0,MinMaxDoubleFour.getMax(10,25));
    }
}