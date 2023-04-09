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

    public Boolean isSpare(GameFrame gf) {
        return gf.getScore() == 10;
    }

    public Boolean isStrike(GameFrame gf) {
        return gf.getScore() == 10 && gf.getFirstScore() == 10;
    }

    public int score() {
        int totalScore = 0;
        for (GameFrame gf: frames) {
            if (isStrike(gf)) {
                GameFrame nextGf = frames.get(frames.indexOf(gf) + 1);
                totalScore += gf.getScore() + nextGf.getScore();
            } else if (isSpare(gf)) {
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
