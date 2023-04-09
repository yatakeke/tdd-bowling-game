package bowlingGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGamePlay {

    @Test
    public void test0本倒した後にscoreが0になる() {

        Game newGame = new Game();
        newGame.play(0);

        assertEquals(0, newGame.getScore());
    }

    @Test
    public void test1本倒した後にscoreが1になる() {
        Game game = new Game();
        game.play(1);

        assertEquals(1, game.getScore());
    }

    @Test
    public void test２本倒した後にscoreが2になる() {
        Game game = new Game();
        game.play(2);

        assertEquals(2, game.getScore());
    }

}
