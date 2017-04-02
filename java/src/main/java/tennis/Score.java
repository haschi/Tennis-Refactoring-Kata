package tennis;

public class Score {
    private final int score;
    private final String player;

    private Score(int score, String player) {
        this.score = score;
        this.player = player;
    }

    // https://sourcemaking.com/refactoring/replace-type-code-with-subclasses
    public static Score erzeugen(int score, String player) {
        return new Score(score, player);
    }

    public boolean istVorteil(Score gegner) {
        return getScore() >=4 || gegner.getScore() >=4;
    }

    public boolean istGleichstand(Score gegner) {
        return getScore() == gegner.getScore();
    }

    public String gleichstand() {

        switch (getScore())
        {
            case 0:
                    return "Love-All";

            case 1:
                    return "Fifteen-All";

            case 2:
                    return "Thirty-All";

            default:
                    return "Deuce";


        }
    }

    public Score nachfolger() {
        return erzeugen(getScore() + 1, getPlayer());
    }

    public String wertAlsZeichenkette() {
        switch(getScore())
        {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";

        }

        throw new IllegalStateException();
    }

    public int getScore() {
        return score;
    }

    public String getPlayer() {
        return player;
    }
}
