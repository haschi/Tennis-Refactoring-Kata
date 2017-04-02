package tennis;

public class Score {
    private final int score;
    private final String player;

    public Score(int score, String player) {
        this.score = score;
        this.player = player;
    }

    public int getScore() {
        return score;
    }

    public String getPlayer() {
        return player;
    }
}
