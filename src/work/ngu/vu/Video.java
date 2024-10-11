package work.ngu.vu;

public class Video extends Media {
    private int duration;

    //initialiazing block
    {
        duration = 0;
    }

    public Video(String title, Genre genre, int duration) {
        super(title,genre,duration);
    }


    public String getTitle() {
        return super.getTitle();
    }

    public void setTitle(String title) {
        super.setTitle(title);
    }

    public Genre getGenre() {
        return super.getGenre();
    }

    public void setGenre(Genre genre) {
        super.setGenre(genre);
    }

    public int getDuration() {
        return super.getDuration();
    }
}