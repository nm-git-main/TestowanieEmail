package org.example;

import junit.framework.TestCase;
import org.junit.Test;
import static org.example.EmailCheck.isValidEmail;

public class EmailCheckTest extends TestCase {

    @Test
    public void testIsValidEmail() {

        String dataOne= "johndoe@gmail.com";
        boolean expected = true;
        boolean actual =  isValidEmail(dataOne);
        assertEquals(expected, actual);
    }
    @Test
    public void testIsValidEmailBigLetters() {

        String dataOne= "JohnDoeIsFuckingMoron55@gmail.com";
        boolean expected = true;
        boolean actual =  isValidEmail(dataOne);
        assertEquals(expected, actual);
    }
}