package HW_ONE.secondHomeWork.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex1Test {

    @Test
    void input() {
        Ex1.number=5;
        assertEquals(12963, Ex1.getNumber());
    }

    @Test
    void binary() {
        Ex1.number=12963;
        assertEquals("11001010100011", Ex1.binary());
    }

    @Test
    void octal(){
        Ex1.number=12963;
        assertEquals("31243", Ex1.octal());
    }

    @Test
    void hex(){
        Ex1.number=12963;
        assertEquals("32a3", Ex1.hexadecimal());
    }
    @Test
    void reverseHex(){
        assertEquals(12963, Ex1.reverseHex("32a3"));
    }
}