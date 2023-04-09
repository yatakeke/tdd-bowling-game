package bowlingGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGamePlay {

    @Test
    public void testすべての投球がガーターのときに最終スコアは0点になる() {

        Game g = new Game();
        for (int i = 0; i < 10; i++) {
            GameFrame gf = new GameFrame();
            gf.play(0);
            gf.play(0);
            g.register(gf);
        }

        assertEquals(0, g.score());
    }

    @Test
    public void test10回全てで5本だけ倒したときに最終スコアは50点になる() {
        Game g = new Game();
        for (int i = 0; i < 10; i++) {
            GameFrame gf = new GameFrame();
            gf.play(5);
            gf.play(0);
            g.register(gf);
        }

        assertEquals(50, g.score());
    }
    
}
