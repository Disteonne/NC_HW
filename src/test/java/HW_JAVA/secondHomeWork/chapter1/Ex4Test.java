package HW_JAVA.secondHomeWork.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex4Test {

    @Test
    void getMin() {
        assertEquals(10.0, Ex4.getMin(10,25));
    }

    @Test
    void getMax() {
        assertEquals(25.0, Ex4.getMax(10,25));
    }
}