package tennis;

public class Won extends Score {
    public Won(int score, String player) {
        super(score, player);
    }

    public Score nachfolger(Score gegner) {
        return new Won(getScore() + 1, getPlayer());
    }

    @Override public String toString() {
        return "Win for";
    }
}
