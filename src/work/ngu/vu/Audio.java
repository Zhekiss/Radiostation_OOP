package work.ngu.vu;

public class Audio extends Media {
    private Genre genre;
    private String title;

    public Audio(Genre genre, String title) {
        this.genre = genre;
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return "Audio."+ title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
