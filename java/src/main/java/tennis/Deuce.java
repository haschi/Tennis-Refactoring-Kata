package tennis;


public abstract class Deuce extends Score{
    public Deuce(int score, String player) {
        super(score, player);
    }

    @Override    public String gleichstandAlsZeichenfolge() {
        return "Deuce";
    }
}
