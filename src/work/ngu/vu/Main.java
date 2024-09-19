package work.ngu.vu;

public class Main {
    public static void main(String[] args){
        Genre rock = new Genre("Rock", "something manly");
        Genre comedy = new Genre("Comedy", "something funny");

        Video video1 = new Video("screaming potato", 60, rock);
        Video video2 = new Video("haleluya", 50, comedy);

        rock.addVideo(video1);
        rock.addVideo(video2);

        Bid myBid = new Bid(500.5, "Vu", video1);

        System.out.println();
    }
}
