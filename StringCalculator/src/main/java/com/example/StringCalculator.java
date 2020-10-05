package com.example;

class StringCalculator {

    private static float result;

    public int add(String input) throws RuntimeException {
        if(input.isEmpty()) {
            return 0;
        }else if(input.contains("-")){
            throw new RuntimeException("Negatives are not allowed.");
        }else{
            calculateSumOf(separateInput(input));
            return formInt(printInteger());
        }
    }

    private String[] separateInput(String numbers) { // Should return string array
        //return numbers.replace("\n", ",").split(","); no need for extra method here
        return numbers.split("[,\n]");
    }

    private void calculateSumOf(String[] numbers){
        for (String number : numbers) {
            result = Float.sum(result, Float.parseFloat(number));
        }
    }

    private int formInt(String sum) throws NumberFormatException {
        return Integer.parseInt(sum);
    }

    private String printInteger() {
        return String.valueOf((int) result);
    }
}
