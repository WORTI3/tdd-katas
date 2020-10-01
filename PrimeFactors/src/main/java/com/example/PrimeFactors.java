package com.example;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> generate(int input){
        //int[] primeNumbers = new int[];
        List<Integer> primeNumbers = new ArrayList<Integer>();
        int divider = 2;
        while (input > 1) {
            while (input % divider == 0) { // % divides left side by right side (Modulus)
                primeNumbers.add(divider);
                input /= divider; // /= Divides left by right then assigns the result to the right side.
            }
            divider++;
        }
        return primeNumbers;
    }
}
