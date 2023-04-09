package bowlingGame;

public class Game {

    private int score = 0;
    public void play(int pins) {
        score += pins;
    }

    public int getScore() {
        return score;
    }
}
