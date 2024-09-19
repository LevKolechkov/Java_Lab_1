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
            };
        }
    }

    @Test
    void makeReverseInstall() {
        
    }

    @Test
    void findReadRoot() {
    }

    @Test
    void calculateN() {
    }

    @Test
    void checkPalindrome() {
    }
}