package HW_ONE.secondHomeWork.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringNineTest {

    @Test
    public void testEqualsStringTrue(){
        assertTrue(StringNine.equalsString("Happy new year!","Happy new year!"));
    }

    @Test
    public void testEqualsStringFalse(){
        assertFalse(StringNine.equalsString("Hello!","Happy new year!"));
    }

    @Test
    public void testEqualsStringCaseIgnoreTrue(){
        assertTrue(StringNine.equalsStringCaseIgnore("Happy new year!","hApPy New Year!"));
    }

}