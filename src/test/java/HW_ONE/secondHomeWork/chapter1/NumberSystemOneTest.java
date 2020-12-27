package HW_ONE.secondHomeWork.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberSystemOneTest {

    @Test
    void input() {
        NumberSystemOne.number=5;
        assertEquals(12963, NumberSystemOne.getNumber());
    }

    @Test
    void binary() {
        NumberSystemOne.number=12963;
        assertEquals("11001010100011", NumberSystemOne.binary());
    }

    @Test
    void octal(){
        NumberSystemOne.number=12963;
        assertEquals("31243", NumberSystemOne.octal());
    }

    @Test
    void hex(){
        NumberSystemOne.number=12963;
        assertEquals("32a3", NumberSystemOne.hexadecimal());
    }
    @Test
    void reverseHex(){
        assertEquals(12963, NumberSystemOne.reverseHex("32a3"));
    }
}