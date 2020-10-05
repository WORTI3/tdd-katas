import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    // No statics or public variables just for pat :)
    public List<String> execute(int min, int max){ // Checks range of numbers
        List<String> output = new ArrayList<String>();
        for (int i = min; i <= max; i++) {
            output.add(String.valueOf(checkNumber(i)));
        }
        System.out.println(output);
        return output;
    }

    public String checkNumber(int num){
        String prefix = "";
        if(num < 16){
            prefix = "Small ";
        }else if(num > 95){
            prefix = "Big ";
        }
        if(isMultipleOfThree(num) && isMultipleOfFive(num)){ // Could use a switch here..
            return prefix + "FizzBuzz"+" FTW";
        }else if(isMultipleOfSeven(num) && isMultipleOfEleven(num)){ // Could use a switch here..
            return prefix + "FooBoo";
        }else if(isMultipleOfFive(num)) {
            return prefix + "Buzz"+" GG";
        }else if(isMultipleOfThree(num)){
            return prefix +"Fizz"+" GG";
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
