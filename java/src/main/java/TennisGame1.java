import tennis.Score;

public class TennisGame1 implements TennisGame {
    


    private Score score1;
    private Score score2;

    public TennisGame1(String player1Name, String player2Name) {
        score1 = Score.erzeugen(0, player1Name);
        score2 = Score.erzeugen(0, player2Name);
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(score1.getPlayer()))
            score1 = score1.nachfolger();
        else
            score2 = score2.nachfolger();
    }

    public String getScore() {
        final Score score1 = this.score1;
        final Score score2 = this.score2;

        if (score1.istGleichstand(score2))
        {
            return score1.gleichstand();
        }
        else if (score1.istVorteil(score2))
        {
            return vorteil(score1, score2);
        }

        return spielstand(score1, score2);
    }

    private static String spielstand(Score score1, Score score2) {
        return score1.wertAlsZeichenkette() + "-" + score2.wertAlsZeichenkette();
    }

    private static String vorteil(Score score1, Score score2) {

        return String.format("%s %s",
                advantage(score1.getScore(), score2.getScore()),
                player(score1, score2));
    }

    private static String player(Score score1, Score score2) {
        return Integer.signum(score1.getScore() - score2.getScore()) == 1 ? score1.getPlayer() : score2.getPlayer();
    }

    private static String advantage(int score1, int score2) {
        return Math.abs(score1 - score2) == 1 ? "Advantage" : "Win for";
    }

}
