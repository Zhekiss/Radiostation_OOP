package work.ngu.vu;

public class Video extends Media {
    private String title;
    private int duration;
    private Genre genre;
    {
        duration = 0;
    }

    public Video(String title, int duration, Genre genre) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    @Override
    public String getTitle() {
        return "Video." + title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public Genre getGenre() {
        return genre;
    }

    @Override
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return  duration;
    }

    public static void printVideoInfo(Video video) {
        System.out.println("Title: " + video.title);
        System.out.println("Genre: " + video.genre);
        System.out.println("Duration: " + video.duration);
    }

}