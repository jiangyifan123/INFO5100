import java.util.Date;
import java.util.List;

public class Movie {
    private String title;
    private Date release;
    List<Person> person;

    Movie(String title, Date release, List<Person> person){
        this.title = title;
        this.release = release;
        this.person = person;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getRelease() {
        return release;
    }

    public void setRelease(Date release) {
        this.release = release;
    }
}
