package bowlingGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestPlayFrame {

    @Test
    public void test5本倒すと5点が加算される() {

        GameFrame gf = new GameFrame();
        gf.play(5);
        assertEquals(5, gf.getScore());
    }

    @Test
    public void test5本倒した後に3本倒すと8点になる() {
        GameFrame gf = new GameFrame();
        gf.play(5);
        gf.play(3);
        assertEquals(8, gf.getScore());
    }

    @Test
    public void test6本倒した後に4本倒すとスペアになる() {
        GameFrame gf = new GameFrame();
        gf.play(6);
        gf.play(4);
        assertEquals(10, gf.getScore());
    }

}
