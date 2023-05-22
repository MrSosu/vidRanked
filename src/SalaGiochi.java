import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SalaGiochi {

    private Set<Videogioco> videogames = new HashSet<>();
    private Set<Utente> users = new HashSet<>();
    private Map<Integer, Integer> globalRanking = new HashMap<>();

    public void addUser(Utente u) {
        users.add(u);
        globalRanking.put(u.getId(), 0);
    }

    public void addVideogame(Videogioco v) {
        videogames.add(v);
    }

    public void addGame(int idUser, int idVG, int score) {
        
    }

}
