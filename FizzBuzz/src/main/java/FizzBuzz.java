public class FizzBuzz {

    public String input(int num){ // Checks a singular number..
        String output;
        if (num != 0 && num != 1) {
            output = checkNumber(num);
            //System.out.print(num);
            inputNums(2, 100);
            return output;
        } else if (num == 1) {
            return "1 Is a multiple of each: 3,5,7 and 11";
        }
        return String.valueOf(num);
    }

    public Object inputNums(int min, int max){ // Checks range of numbers
        for(int i = min; i < max; i++) {
            String output = checkNumber(i);
            System.out.print(output + ", ");
        }
        return null;
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
        return prefix + String.valueOf(num);
    }

    public boolean isMultipleOfThree(int num){
        if(num % 3 == 0 || num == 1){ // Modulo operator used: https://en.wikipedia.org/wiki/Modulo_operation
            return true;
        }
        return false;
    }

    public boolean isMultipleOfFive(int num){
        if(num % 5 == 0 || num == 1){ // Modulo operator used: https://en.wikipedia.org/wiki/Modulo_operation
            return true;
        }
        return false;
    }

    public boolean isMultipleOfSeven(int num){
        if(num % 7 == 0 || num == 1){ // Modulo operator used: https://en.wikipedia.org/wiki/Modulo_operation
            return true;
        }
        return false;
    }

    public boolean isMultipleOfEleven(int num){
        if(num % 11 == 0 || num == 1){ // Modulo operator used: https://en.wikipedia.org/wiki/Modulo_operation
            return true;
        }
        return false;
    }

}
