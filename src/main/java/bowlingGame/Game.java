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
            if (gf.isStrike()) {
                GameFrame nextGf = frames.get(frames.indexOf(gf) + 1);
                totalScore += gf.getScore() + nextGf.getScore();
            } else if (gf.isSpare()) {
                GameFrame nextGf = frames.get(frames.indexOf(gf) + 1);
                totalScore += gf.getScore() + nextGf.getFirstScore();
            }
            else {
                totalScore += gf.getScore();
            }
        }
        return totalScore;
    }
}
