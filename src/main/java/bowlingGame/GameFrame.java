package bowlingGame;

import java.util.ArrayList;
import java.util.List;

public class GameFrame {

    private List<Integer> scores;

    public GameFrame() {
        this.scores = new ArrayList<>();
    }

    public void play(int pins) {
        this.scores.add(pins);
    }

    public int getScore() {
        int s = 0;
        for (int score: scores) {
            s += score;
        }
        return s;
    }
    public int getFirstScore() {
        // spareの際に必要そう
        return scores.get(0);
    }
}
