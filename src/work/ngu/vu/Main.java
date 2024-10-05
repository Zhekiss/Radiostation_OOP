package work.ngu.vu;

public class Main {
    public static void main(String[] args){
        Genre rock = new Genre("Rock", "something manly");
        Genre comedy = new Genre("Comedy", "something funny");

        Video video1 = new Video("screaming potato", 60, rock);
        Video video2 = new Video("haleluya", 50, comedy);
        Video video3 = new Video("chaplin",300, comedy);

        rock.addVideo(video1);
        rock.addVideo(video2);
        comedy.addVideo(video3);

        Bid myBid = new Bid(500.0, "Me", video1);

        System.out.println(Genre.genre_count);
    }
}
