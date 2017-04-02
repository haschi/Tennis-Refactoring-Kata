package tennis;

public class Forty extends Deuce {
    public Forty(String player) {
        super(3, player);
    }

    @Override public String toString() {
        return "Forty";
    }

    @Override public Score nachfolger(Score gegner) {
        return new Advantage(getScore() + 1, getPlayer());
    }
}
