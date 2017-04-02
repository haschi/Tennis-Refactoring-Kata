import tennis.Love;
import tennis.Score;

public class TennisGame1 implements TennisGame {


    private static String höher;
    private Score score1;
    private Score score2;

    public TennisGame1(String player1Name, String player2Name) {
        score1 = new Love(player1Name);
        score2 = new Love(player2Name);
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(score1.getPlayer()))
            score1 = score1.nachfolger(score2);
        else
            score2 = score2.nachfolger(score1);
    }

    public String getScore() {

        if (this.score1.istGleichstand(this.score2))
        {
            return this.score1.gleichstandAlsZeichenfolge();
        }
        else if (this.score1.hatVorteil() || this.score2.hatVorteil())
        {
            return vorteil(this.score1, this.score2);
        }

        return spielstand(this.score1, this.score2);
    }

    private static String spielstand(Score score1, Score score2) {
        return score1.toString() + "-" + score2.toString();
    }

    private static String vorteil(Score score1, Score score2) {
        Score höherePunktzahl = bestimmeHöherePunktzahl(score1, score2);
        return String.format("%s %s",
                advantage(score1, score2),
                höherePunktzahl.getPlayer());
    }

    private static Score bestimmeHöherePunktzahl(Score score1, Score score2) {
        return Integer.signum(score1.getScore() - score2.getScore()) == 1
                ? score1
                : score2;
    }

    private static String advantage(Score score1, Score score2) {

        return Math.abs(score1.getScore() - score2.getScore()) == 1
                ? bestimmeHöherePunktzahl(score1, score2).toString()
                : "Win for";
    }
}
