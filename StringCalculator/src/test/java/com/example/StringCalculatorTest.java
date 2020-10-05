package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    public Object add(String input){ // Used to avoid using statics in main class file.. :)
        return new StringCalculator().add(input);
    }

    @Test
    public void shouldReturnZeroOnEmptyString() {
        assertEquals(0, add(""));
    }

    @Test
    public void shouldReturnSingleNumberOnInput() {
        assertEquals(1, add("1"));
    }

    @Test
    public void shouldReturnSumOfTwoNumbersDelimitedByAComma(){
        assertEquals(3, add("1,2"));
    }

    @Test
    public void shouldReturnSumOfMultipleNumbers() {
        assertEquals(6, add("1,2,3"));
    }

    @Test
    public void shouldReturnSumOfTwoNumbersDelimitedByANewLine(){
        assertEquals(3, add("1\n2"));
    }

    @Test
    public void shouldThrowRuntimeErrorWhenNegativePresent(){
        RuntimeException e = assertThrows(RuntimeException.class, () -> add("-1,2,-3"));
        assertEquals("Negatives are not allowed.", e.getMessage());
    }

}