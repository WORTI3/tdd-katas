import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    public Object input(int num){ // Used to avoid using statics in main class file.. :)
        return new FizzBuzz().input(num);
    }

    public void inputNums(int min, int max){ // Used to avoid using statics in main class file.. :)
        new FizzBuzz().inputNums(min, max);
    }

    @Test
    public void shouldReturnZeroIfNumIsZero() {
        assertEquals("0", input(0));
    }

    @Test
    void shouldReturnOneIfOneIsInput() {
        assertEquals("1 Is a multiple of each: 3,5,7 and 11", input(1));
    }

    @Test
    void shouldReturnFizzIfNumIsThree() {
        assertEquals("Small Fizz", input(3));
    }

    @Test
    void shouldReturnBuzzIfNumIsFive() {
        assertEquals("Buzz", input(5));
    }

    @Test
    void shouldReturnFizzIfNumIsSix() {
        assertEquals("Fizz", input(6));
    }

    @Test
    void shouldReturnFizzIfNumIsTen() {
        assertEquals("Buzz", input(10));
    }

    @Test
    void shouldReturnFizzBuzzIfNumIsOne() {
        assertEquals("FizzBuzz", input(1));
    }

    @Test
    void shouldReturnFizzBuzzIfNumIsFifteen() {
        assertEquals("FizzBuzz", input(15));
    }

    // 3&5 done at this point.. now "fooboo"

    @Test
    void shouldReturnSmallFooIfNumIsSeven() {
        assertEquals("Small Foo", input(7));
    }

    @Test
    void shouldReturnSmallBooIfNumIsEleven() {
        assertEquals("Small Boo", input(11));
    }

    @Test
    void shouldReturnFooBooIfNumIs77() {
        assertEquals("FooBoo", input(77));
    }

    @Test
    void shouldPrintAllNumbersWithinTwoAndOneHundred() {
        inputNums(2, 100);
    }
}