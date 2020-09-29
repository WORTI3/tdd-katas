
import org.jetbrains.annotations.NotNull;
import java.time.LocalTime;

class Greeter {

    public static String greeting; // Global variable?

    public static void main(String[] args){
        greet("bob");
    } //This is just use to test overall code after tests to make sure it works.

    static Object greet(String name){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("'name' cannot be null or empty");
        }
        String message = name.trim();
        message = message.substring(0, 1).toUpperCase() + message.substring(1);
        return timedGreeting(LocalTime.now()) + message;
    }

    @NotNull
    private static String timedGreeting(LocalTime hours){
        if(hours.isAfter(LocalTime.parse("05:59:59")) && hours.isBefore(LocalTime.NOON)) { // TEST: hours.isBefore(LocalTime.parse("12:06:20"))){
            greeting = "Good Morning ";
        }else if(hours.isBefore(LocalTime.parse("22:00:00")) && hours.isAfter(LocalTime.NOON)){
            greeting = "Good Evening ";
        }else if(hours.isBefore(LocalTime.parse("05:59:59")) && hours.isAfter(LocalTime.parse("22:00:00"))){
            greeting = "Good Night ";
        }else{
            greeting = "Hello ";
        }
        return greeting;
    }
}