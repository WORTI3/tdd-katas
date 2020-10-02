
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

class FizzBuzzTest {

    public String input(int num){ // Used to avoid using statics in main class file.. :)
        return new FizzBuzz().execute(num, num).get(0);
    }

    public String input(int min, int max){
        return new FizzBuzz().execute(min, max).get(0);
    }

    @Test
    void shouldReturnOneIfOneIsInput() {
        assertThat(input(1), containsString("1"));
    }

    @Test
    void shouldReturnFizzIfNumIsThree() {
        assertThat(input(3), containsString("Fizz"));
    }

    @Test
    void shouldReturnBuzzIfNumIsFive() {
        assertThat(input(5), containsString("Buzz"));
    }

    @Test
    void shouldReturnFizzIfNumIsSix() {
        assertThat(input(6), containsString("Fizz"));
    }

    @Test
    void shouldReturnFizzIfNumIsTen() {
        assertThat(input(10), containsString("Buzz"));
    }

    @Test
    void shouldReturnFizzBuzzIfNumIsFifteen() {
        assertThat(input(15), containsString("FizzBuzz"));
    }

    // 3&5 done at this point.. now "fooboo"

    @Test
    void shouldReturnSmallFooIfNumIsSeven() {
        assertThat(input(7), containsString("Foo"));
    }

    @Test
    void shouldReturnSmallBooIfNumIsEleven() {
        assertThat(input(11), containsString("Boo"));
    }

    @Test
    void shouldReturnFooBooIfNumIs77() {
        assertThat(input(77), containsString("FooBoo"));
    }

    @Test
    void checkToSeeChangeInRangeWorks(){
        assertThat(input(1, 20), containsString("Small"));
    }

    @Test
    void checkToSeeBigTagInRange(){
        assertThat(input(96, 100), containsString("Big"));
    }

    @Test
    void checkToSeeChangeInRangeWorksSecondTest(){
        assertThat(input(15, 50), containsString("Buzz"));
    }

    @Test
    void multiplesOf3And5ShouldReturnFTW(){
        assertThat(input(15), containsString("FTW"));
    }

    @Test
    void multiplesOf3Or5ShouldReturnGG(){
        assertThat(input(6), containsString("GG"));
    }
}