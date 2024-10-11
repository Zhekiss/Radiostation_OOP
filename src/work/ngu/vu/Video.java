package work.ngu.vu;

public class Video extends Media {

    public Video(String title, Genre genre, int duration) {
        super(title,genre,duration);
    }

    //getters & setters
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

    //other methods
    public int getDuration() {
        return super.getDuration();
    }
    @Override
    public void all_Info() {
        System.out.println("This video is called: " + getTitle());
        System.out.println("This videos duration is: " + getDuration());
        System.out.println("This videos genre is: " + getGenre());
    }
}