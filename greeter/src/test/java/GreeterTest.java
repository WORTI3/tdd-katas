
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {

    public Object greeting(String arg){
        return new Greeter().greet(arg);
    }

    @Test
    public void shouldThrowExceptionOnNullObject() throws Exception {
        assertThrows(IllegalArgumentException.class, () -> greeting(null));
    }

    @Test
    public void shouldThrowExceptionOnEmptyObject() throws Exception {
        assertThrows(StringIndexOutOfBoundsException.class, () -> greeting(""));
    }

    @Test
    public void shouldThrowExceptionOnBlankObject() throws Exception {
        assertThrows(StringIndexOutOfBoundsException.class, () -> greeting(" "));
    }

    @Test
    public void shouldGreetNameWithHello() throws Exception {
        assertEquals("Hello Bob", greeting("Bob"));
    }

    @Test
    public void shouldTrimGreeterName() throws Exception {
        assertEquals("Hello Bob", greeting(" Bob "));
    }

    @Test
    public void shouldMakeFirstLetterCapital() throws Exception {
        assertEquals("Hello Bob", greeting("bob"));
    }

    @Test
    public void shouldReturnMessageWhenTimeIsAbove6AMAndBelowMidDay() throws Exception {
        assertEquals("Good Morning Bob", greeting("Bob")); // Timings changed in main file to fully test the parsed times
    }

    @Test
    public void shouldReturnMessageWhenTimeIsAfter12AndBeforeMidDay() throws Exception {
        assertEquals("Good Evening Bob", greeting("Bob")); // Timings changed in main file to fully test the parsed times
    }

    @Test
    public void shouldReturnNightMessageAtCorrectTime() throws Exception {
        assertEquals("Good Night Bob", greeting("Bob")); // Timings changed in main file to fully test the parsed times
    }
}