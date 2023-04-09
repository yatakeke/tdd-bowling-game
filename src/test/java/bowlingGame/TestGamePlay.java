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

    @Test
    public void testスペアを一回出してその後の投球は7を出したときに得点が24点になる() {
        Game g = new Game();

        GameFrame firstGf = new GameFrame();
        firstGf.play(4);
        firstGf.play(6);
        g.register(firstGf);

        GameFrame secondGf = new GameFrame();
        secondGf.play(7);
        secondGf.play(0);
        g.register(secondGf);

        assertEquals(24, g.score());
    }

}
