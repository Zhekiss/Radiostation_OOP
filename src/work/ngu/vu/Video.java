package work.ngu.vu;

public class Video extends Media {
    private String title;
    private int duration; // in seconds
    private Genre genre;
    private int views;

    public Video(String title, int duration, Genre genre) {
        super();
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getViews() {
        return views;
    }

    public int addViews() {
        return views++;
    }
}