package HW_ONE.secondHomeWork.chapter1;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FactorialSixTest {

    @Test
    void factorial() throws Exception {
        assertEquals("6227020800",FactorialSix.factorial(13).toString());
    }

    @Test
    void factorialOneThousand() throws Exception {
        assertEquals("",FactorialSix.factorial(1000).toString());
    }

}