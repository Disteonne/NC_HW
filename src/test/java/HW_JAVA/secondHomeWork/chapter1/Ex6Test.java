package HW_JAVA.secondHomeWork.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex6Test {

    @Test
    void factorial() throws Exception {
        assertEquals("6227020800", Ex6.factorial(13).toString());
    }

    @Test
    void factorialOneThousand() throws Exception {
        assertEquals("", Ex6.factorial(1000).toString());
    }

}