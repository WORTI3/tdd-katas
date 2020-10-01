public class FizzBuzz {

    // No statics or public variables ust for pat :)
    public String input(int num){ // Checks a singular number..
        String output;
        if (num != 0 && num != 1) {
            output = checkNumber(num); // Need to clean this part up
            inputNums(2, 100);
            return output;
        } else if (num == 1) {
            return "1 Is a multiple of each: 3,5,7 and 11";
        }
        return String.valueOf(num);
    }

    public void inputNums(int min, int max){ // Checks range of numbers
        for(int i = min; i < max; i++) {
            String output = checkNumber(i);
            System.out.print(output + ", ");
        }
    }

    public String checkNumber(int num){
        String prefix = "";
        if(num < 16){
            prefix = "Small ";
        }else if(num > 94){
            prefix = "Big ";
        }
        if(isMultipleOfThree(num) && isMultipleOfFive(num)){ // Could use a switch here..
            return prefix + "FizzBuzz";
        }else if(isMultipleOfSeven(num) && isMultipleOfEleven(num)){ // Could use a switch here..
            return prefix + "FooBoo";
        }else if(isMultipleOfFive(num)) {
            return prefix + "Buzz";
        }else if(isMultipleOfThree(num)){
            return prefix +"Fizz";
        }else if(isMultipleOfEleven(num)){
            return prefix +"Boo";
        }else if(isMultipleOfSeven(num)){
            return prefix +"Foo";
        }
        return prefix + num;
    }

    public boolean isMultipleOfThree(int num){
        // Modulo operator used: https://en.wikipedia.org/wiki/Modulo_operation
        return num % 3 == 0;
    }

    public boolean isMultipleOfFive(int num){
        return num % 5 == 0;
    }

    public boolean isMultipleOfSeven(int num){
        return num % 7 == 0;
    }

    public boolean isMultipleOfEleven(int num){
        return num % 11 == 0;
    }
}
