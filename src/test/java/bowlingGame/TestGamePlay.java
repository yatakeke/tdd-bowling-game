package bowlingGame;

import com.sun.management.GarbageCollectionNotificationInfo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGamePlay {

    @Test
    public void testGameをplayできる() {
        Game newGame = new Game();
        newGame.play();

    }

    @Test
    public void testGameをplay後にscoreが0になる() {

        Game newGame = new Game();
        newGame.play();

        assertEquals(0, newGame.score());
    }
}
