package work.ngu.vu;

public class Video extends Media {
    private String title;
    private int duration; // in seconds
    private Genre genre;

    public Video(String title, int duration, Genre genre) {
        super();
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    public String getTitle() {
        return "Video." + title;
    }
    public Genre getGenre() {
        return genre;
    }
    public int getDuration() {
        return  duration;
    }
}