import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingGameTest {

    public static BowlingGame game;

    @Test
    public void init() {
        game = new BowlingGame();
    }


    @Test
    public void scoreShouldReturnNullWhenNoPinsKnockedDown() throws Exception {
        assertEquals(0, game.score());
    }



}