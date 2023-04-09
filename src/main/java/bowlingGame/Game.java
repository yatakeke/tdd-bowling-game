package bowlingGame;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<GameFrame> frames;

    public Game() {
        frames = new ArrayList<GameFrame>();
    }

    public void register(GameFrame gf) {
        frames.add(gf);
    }

    public int score() {
        int totalScore = 0;
        for (GameFrame gf: frames) {
            totalScore += gf.getScore();
        }
        return totalScore;
    }
}
