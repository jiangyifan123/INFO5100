import java.text.SimpleDateFormat;
import java.util.*;

public class Final_4 {
    public static String addReleaseToTitle(Movie m){
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        String year = yearFormat.format(Date.parse(String.valueOf(m.getRelease())));
        return year + m.getTitle();
    }
    public static void main(String[] args) {
        Netflix netflix = new Netflix();
        System.out.println("add list of movies");
        List<Person> PersonList = Arrays.asList(new Person("Mr.Brown"));
        Movie horrble1 = new Movie("movie1", new GregorianCalendar(1980, Calendar.FEBRUARY, 11).getTime(), PersonList);
        Movie horrble2 = new Movie("movie2", new GregorianCalendar(1991, Calendar.FEBRUARY, 11).getTime(), PersonList);
        Movie happy1 = new Movie("movie3", new GregorianCalendar(2001, Calendar.MONTH, 11).getTime(), PersonList);
        Movie happy2 = new Movie("movie4", new GregorianCalendar(1995, Calendar.FEBRUARY, 11).getTime(), PersonList);
        Genre horrible = new Genre();
        Genre happy = new Genre();
        horrible.addMovie(horrble1);
        horrible.addMovie(horrble2);
        happy.addMovie(happy1);
        happy.addMovie(happy2);
        netflix.addGenre(happy);
        netflix.addGenre(horrible);
        System.out.println();

        List<Movie> movies = new ArrayList<>();
        for(Genre e: netflix.genres){
            for(Movie m: e.movies){
                movies.add(m);
            }
        }


        Date end = new GregorianCalendar(2000, GregorianCalendar.MONTH, 1).getTime();
        Date start = new GregorianCalendar(1990, GregorianCalendar.MONTH, 1).getTime();

        System.out.println("add (classic) to the title of the movies before 2000");
        for(Movie m: movies){
            if(m.getRelease().before(end))
                m.setTitle("(Classic)" + m.getTitle());
        }
        System.out.println();

        System.out.println("get latest 3 movies");
        Object[] late3 = movies.stream()
                .sorted(new Comparator<Movie>() {
                    @Override
                    public int compare(Movie o1, Movie o2) {
                        return o2.getRelease().compareTo(o1.getRelease());
                    }
                })
                .limit(3)
                .toArray();
        for(Object m: late3){
            Movie t = (Movie)m;
            System.out.println(t.getRelease());
        }
        System.out.println();

        System.out.println("predict for movies 1990 ~ 2000");
        Object[] predicate = movies.stream()
                .filter(movie -> movie.getRelease().after(start) && movie.getRelease().before(end))
                .toArray();
        for(Object m: predicate){
            Movie t = (Movie)m;
            System.out.println(t.getRelease());
        }
        System.out.println();

        System.out.println("method add release year in the title");
        for(Movie m : movies){
            System.out.println(addReleaseToTitle(m));
        }
        System.out.println();

        System.out.println("sorting on one of the feature");
        movies.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getRelease().compareTo(o2.getRelease());
            }
        });
        for(Movie m: movies){
            System.out.println(m.getRelease());
        }
    }
}
