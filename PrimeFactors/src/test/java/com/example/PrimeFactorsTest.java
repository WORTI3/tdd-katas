package com.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorsTest {

    public List<Integer> generate(int num){
        return new PrimeFactors().generate(num);
    }

    private List<Integer> list(int... numbers){
        List<Integer> list = new ArrayList<Integer>();
        for(int i : numbers) list.add(i);
        return list;
    }

    @Test
    public void shouldThrowException() throws Exception {
        assertEquals(list(), generate(1));
    }

    @Test
    public void shouldReturnTwoIfInputIsTwo() {
        assertEquals(list(2), generate(2));
    }

    @Test
    public void shouldReturnThreeIfInputIsThree() throws Exception {
        assertEquals(list(3), generate(3));
    }

    @Test
    public void shouldReturnTwoTwosIfInputIsFour() throws Exception {
        assertEquals(list(2,2), generate(4));
    }

    @Test
    public void shouldReturnFiveIfInputIsFive() throws Exception {
        assertEquals(list(5), generate(5));
    }

    @Test
    public void shouldReturnTwoAndThreeIfInputIsSix() throws Exception {
        assertEquals(list(2,3), generate(6));
    }

    @Test
    public void shouldReturnSevenIfInputIsSeven() throws Exception {
        assertEquals(list(7), generate(7));
    }

    @Test
    public void shouldReturnThreeTwosIfInputIsEight() throws Exception {
        assertEquals(list(2,2,2), generate(8));
    }

    @Test
    public void shouldReturnTwoThreesIfInputIsNine() throws Exception {
        assertEquals(list(3,3), generate(9));
    }

    @Test
    public void shouldReturnPrimesOfAnyNumber() throws Exception {
        assertEquals(list(2,2,3,5,7,11), generate(4620));
    }

}