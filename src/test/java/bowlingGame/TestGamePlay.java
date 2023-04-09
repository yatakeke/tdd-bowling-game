package bowlingGame;

import org.junit.jupiter.api.Test;

public class TestGamePlay {

    @Test
    public void testGameをplayできる() {
        Game newGame = new Game();
        newGame.play();

    }
}
