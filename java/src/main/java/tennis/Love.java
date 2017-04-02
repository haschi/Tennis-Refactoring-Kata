package tennis;

/**
 * Created by matthias on 02.04.17.
 */
public class Love extends Score {
    public Love(String player) {
        super(0, player);
    }

    @Override
    public int getScore() {
        return 0;
    }

    @Override public String gleichstand() {
        return "Love-All";
    }

    @Override public String wertAlsZeichenkette() {
        return "Love";
    }
}
