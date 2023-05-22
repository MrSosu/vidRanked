import java.util.HashMap;
import java.util.Map;

public class Videogioco {

    private static int idTot = 0;
    private int id;
    private String title;
    private Level level;
    private Map<Utente, Integer> ranking;

    public Videogioco(String title, Level level) {
        this.id = ++idTot;
        this.title = title;
        this.level = level;
        this.ranking = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Map<Utente, Integer> getRanking() {
        return ranking;
    }

    public void setRanking(Map<Utente, Integer> ranking) {
        this.ranking = ranking;
    }

    public void updateRank(Utente u, int score) {
        if (!ranking.containsKey(u)) {
            ranking.put(u, score);
        }
        else {
            if (score > ranking.get(u)) {
                ranking.put(u, score);
            }
        }
    }

}
