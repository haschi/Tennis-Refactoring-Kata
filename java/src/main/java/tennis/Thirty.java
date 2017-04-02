package tennis;

public class Thirty extends Score {
    public Thirty(String player) {
        super(2, player);
    }

    @Override public String toString() {
        return "Thirty";
    }

    @Override public Score nachfolger(Score gegner) {
        return new Forty(getPlayer());
    }
}
