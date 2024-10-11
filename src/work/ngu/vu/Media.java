package work.ngu.vu;

public class Media {
    private String title;
    private Genre genre;
    private int duration;
    public static final int MAX_DURATION = 600;
    private static int mediaCount;

    //initialiazing block
    static {
        mediaCount = 0;
    }
    //non_static
    {
        mediaCount++;
    }

    public Media(String title, Genre genre, int duration) {
        this.title = title;
        this.genre = genre;
        if (duration <0 || duration > MAX_DURATION) {
            System.out.println( title + "  has reached limited duration! Max duration is set to 600 seconds!");
            this.duration = 0;
        } else {
            this.duration = duration;
        }
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public  void setGenre(Genre genre) {
        this.genre = genre;
    }
    //other methods
    public int getDuration() {
        return duration;
    }

    public void all_Info() {
    }
}
