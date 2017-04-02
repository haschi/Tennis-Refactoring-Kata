package tennis;

public class Love extends Score {
    public Love(String player) {
        super(0, player);
    }

    @Override
    public int getScore() {
        return 0;
    }

    @Override public String toString() {
        return "Love";
    }

    @Override public Score nachfolger(Score gegner) {
        return new Fifteen(getPlayer());
    }
}
