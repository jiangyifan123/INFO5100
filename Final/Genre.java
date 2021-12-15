import java.util.ArrayList;
import java.util.List;

public class Genre {
    List<Movie> movies;
    Genre(){
        movies = new ArrayList<>();
    }
    public void addMovie(Movie m){
        movies.add(m);
    }
}
