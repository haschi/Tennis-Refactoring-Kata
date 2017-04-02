package tennis;

public abstract class Score implements ScoreInterface {
    private final int score;
    private final String player;

    Score(int score, String player) {
        this.score = score;
        this.player = player;
    }

    public boolean hatVorteil() {
        return false;
    }

    public boolean istGleichstand(Score gegner) {
        return getScore() == gegner.getScore();
    }

    public String gleichstandAlsZeichenfolge() {
        return toString() + "-All";
    }

    public abstract Score nachfolger(Score gegner);

    public int getScore() {
        return score;
    }

    public String getPlayer() {
        return player;
    }
}
