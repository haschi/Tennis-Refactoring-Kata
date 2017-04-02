import tennis.Score;

public class TennisGame1 implements TennisGame {
    
    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name))
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String getScore() {
        final Score score1 = new Score(m_score1, player1Name);
        final Score score2 = new Score(m_score2, player2Name);

        if (istGleichstand(score1, score2))
        {
            return gleichstand(score1);
        }
        else if (istVorteil(score1, score2))
        {
            return vorteil(score1, score2);
        }

        return spielstand(score1, score2);
    }

    private static String spielstand(Score score1, Score score2) {
        return spielstand(score1) + "-" + spielstand(score2);
    }

    private static String spielstand(Score score) {
        switch(score.getScore())
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

    private static String gleichstand(Score xscore) {

        switch (xscore.getScore())
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

    private static boolean istVorteil(Score score1, Score score2) {
        return score1.getScore() >=4 || score2.getScore() >=4;
    }

    private static boolean istGleichstand(Score score1, Score score2) {
        return score1.getScore() == score2.getScore();
    }
}
