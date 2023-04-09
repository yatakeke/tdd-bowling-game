package bowlingGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGamePlay {

    @Test
    public void testすべての投球がガーターのときに最終スコアは0点になる() {

        Game g = new Game();
        for (int i = 0; i < 10; i++) {
            GameFrame gf = playSingleFrame(0, 0);
            g.register(gf);
        }

        assertEquals(0, g.score());
    }

    @Test
    public void test10回全てで5本だけ倒したときに最終スコアは50点になる() {
        Game g = new Game();
        for (int i = 0; i < 10; i++) {
            GameFrame gf = playSingleFrame(5, 0);
            g.register(gf);
        }

        assertEquals(50, g.score());
    }

    @Test
    public void testスペアを一回出してその後の投球は7を出したときに得点が24点になる() {
        Game g = new Game();

        GameFrame firstGf = playSingleFrame(4, 6);
        g.register(firstGf);

        GameFrame secondGf = playSingleFrame(7, 0);
        g.register(secondGf);

        assertEquals(24, g.score());
    }

    public GameFrame playSingleFrame(int firstPin, int secondPin) {
        GameFrame gf = new GameFrame();
        gf.play(firstPin);
        gf.play(secondPin);
        return gf;
    }
}
