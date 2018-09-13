package Lab4;

/**
 * Created by CianC on 18/10/2017.
 */
public class Film {
    private String title;
    private String director;
    private int duration;
    private static int counter;

    public Film() {
        this("Unknown", "Unknown", 0);
    }

    public Film(String title, String diractor, int duration) {
        this.title = title;
        this.director = diractor;
        this.duration = duration;
        counter++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Film.counter = counter;
    }

    public String toString() {
        return "Title: " + getTitle() + "\nDirector: " + getDirector() + "\nDuration: " + getDuration() + " mins\n\n";
    }
}