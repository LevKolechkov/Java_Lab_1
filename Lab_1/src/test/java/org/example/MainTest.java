package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void fizzOrBuzz() {
        for (int number = 1; number <= 500; ++number){
            if (number % 5 == 0 && number % 7 == 0) {
                assertEquals("fizzbuzz", Main.fizzOrBuzz(number));
            }
            else if (number % 5 == 0) {
                assertEquals("fizz", Main.fizzOrBuzz(number));
            } else if (number % 7 == 0) {
                assertEquals("buzz", Main.fizzOrBuzz(number));
            } else assertEquals("number", Main.fizzOrBuzz(number));
        }
    }

    @Test
    void makeReverseInstall() {
        String checkWord = "make install";
        assertEquals("llatsni ekam", Main.makeReverseWord(checkWord));
    }

    @Test
    void findReadRoot() {
        int a = 1;
        int b = -3;
        int c = 2;

        assertEquals(true, Main.findReadRoot(a, b, c));

        a = 1;
        b = 2;
        c = 5;

        assertEquals(false, Main.findReadRoot(a, b, c));
    }

    /*@Test
    void calculateN() {
        double tinyNumber = Main.calculateN();

        assertTrue((tinyNumber < Math.pow(10, -6)));
    }*/

    @Test
    void checkPalindrome() {
        String checkWord = "level";

        assertTrue(Main.checkPalindrome(checkWord));

        checkWord = "te  N      Et";
        assertTrue(Main.checkPalindrome(checkWord));

        checkWord = "bruh";
        assertFalse(Main.checkPalindrome(checkWord));
    }
}