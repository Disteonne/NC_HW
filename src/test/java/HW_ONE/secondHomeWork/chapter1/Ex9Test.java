package HW_ONE.secondHomeWork.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex9Test {

    @Test
    public void testEqualsStringTrue(){
        assertTrue(Ex9.equalsString("Happy new year!","Happy new year!"));
    }

    @Test
    public void testEqualsStringFalse(){
        assertFalse(Ex9.equalsString("Hello!","Happy new year!"));
    }

    @Test
    public void testEqualsStringCaseIgnoreTrue(){
        assertTrue(Ex9.equalsStringCaseIgnore("Happy new year!","hApPy New Year!"));
    }

}