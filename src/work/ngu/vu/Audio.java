package work.ngu.vu;

public class Audio extends Media {

    public Audio(String title, Genre genre, int duration) {
        super(title, genre, duration);
    }

    //getters & setters
    public Genre getGenre() {
        return super.getGenre();
    }

    public void setGenre(Genre genre) {
        super.setGenre(genre);
    }

    public String getTitle() {
        return super.getTitle();
    }

    public void setTitle(String title) {
        super.setTitle(title);
    }

    //other methods
    public int getDuration() {
        return super.getDuration();
    }

    @Override
    public void all_Info() {
        System.out.println("This audio is called: " + getTitle());
        System.out.println("This audios duration is: " + getDuration());
        System.out.println("This audios genre is: " + getGenre().toString());
    }
}
