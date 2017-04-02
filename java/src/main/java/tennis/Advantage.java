package tennis;

public class Advantage extends Deuce {
    public Advantage(int score, String player) {
        super(score, player);
    }

    @Override public Score nachfolger(Score gegner) {
//        if(getScore() + 1 == gegner.getScore()) {
//            return new Won(getScore() + 1, getPlayer());
//        }

        return new Advantage(getScore() + 1, getPlayer());
    }

    @Override public boolean hatVorteil()  {
        return true;
    }

    @Override
    public String toString() {
        return "Advantage";
    }
}
