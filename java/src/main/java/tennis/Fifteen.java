package tennis;

public class Fifteen extends Score {
    public Fifteen(String player) {
        super(1, player);
    }

    @Override public String toString() {
        return "Fifteen";
    }

    @Override public Score nachfolger(Score gegner) {
        return new Thirty(getPlayer());
    }
}
