package tennis;

/**
 * Created by matthias on 02.04.17.
 */
public interface ScoreInterface {
    String gleichstandAlsZeichenfolge();

    Score nachfolger(Score gegner);

    String toString();
}
