package work.ngu.vu;

public class Audio extends Media {
    private Genre genre;
    private String title;
    private int duration;
    {
        duration = 0;
    }

    public Audio(String title, Genre genre) {
        this.genre = genre;
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

    @Override
    public String getTitle() {
        return "Audio." + title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    public static void printAudioInfo(Audio audio) {
        System.out.println("Title: " + audio.title);
        System.out.println("Genre: " + audio.genre);
        System.out.println("Duration: " + audio.duration);
    }

    public int getDuration() {
        return  duration;
    }
}
