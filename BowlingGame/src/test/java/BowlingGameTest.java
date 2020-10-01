import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {

    private BowlingGame game;

    @Test
    public void init() {
        game = new BowlingGame();
    }

    @Test
    public void scoreShouldReturnNullWhenNoPinsKnockedDown() throws Exception {
        assertEquals(0, game.score()); // Redundant test.. leaving it in just for continuity..
    }

    @Test
    public void shouldReturnNullIfEachFrameIsAGutterBall() throws Exception {
        init();
        game.roll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertEquals(0, game.score());
    }

    @Test
    public void testForSpare() throws Exception {
        init();
        game.roll(5,5, 3,0, 0,0, 0,0, 0,0, 0,0);
        assertEquals(16, game.score());
    }

    @Test
    public void testForStrikeFollowedByTwoBowls() throws Exception {
        init();
        game.roll(10, 3,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertEquals(16, game.score());
    }

    @Test
    public void shouldReturn300IfAllStrikes() throws Exception {
        init();
        game.roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        assertEquals(300, game.score());
    }


}