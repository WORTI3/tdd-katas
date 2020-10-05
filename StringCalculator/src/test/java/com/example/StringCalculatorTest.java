package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    public Object add(String input){ // Used to avoid using statics in main class file.. :)
        return new StringCalculator().add(input);
    }

    @Test
    void shouldReturnZeroOnEmptyString() {
        assertEquals(0, add(""));
    }

    @Test
    void shouldReturnSingleNumberOnInput() {
        assertEquals(1, add("1"));
    }

    @Test
    void shouldReturnSumOfTwoNumbersDelimitedByAComma(){
        assertEquals(3, add("1,2"));
    }

    @Test
    void shouldReturnSumOfMultipleNumbers() {
        assertEquals(6, add("1,2,3"));
    }

    @Test
    void shouldReturnSumOfTwoNumbersDelimitedByANewLine(){
        assertEquals(3, add("1\n2"));
    }

    @Test
    void shouldThrowRuntimeErrorWhenNegativePresent(){
        RuntimeException e = assertThrows(RuntimeException.class, () -> add("-1,2,-3"));
        assertEquals("Negatives are not allowed.", e.getMessage());
    }

}