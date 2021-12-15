import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Netflix {
    List<Genre> genres;

    Netflix(){
        genres = new ArrayList<>();
    }

    void addGenre(Genre g){
        genres.add(g);
    }
}
