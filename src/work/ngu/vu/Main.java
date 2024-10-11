package work.ngu.vu;

public class Main {
    public static void main(String[] args){
        Genre rock = new Genre("Rock", "something manly");
        Genre comedy = new Genre("Comedy", "something funny");
        Genre rnb = new Genre("R&B","somthing vibing");

        Video video1 = new Video("screaming potato", rock, 60);
        Video video2 = new Video("haleluya", comedy, 50);
        Video video3 = new Video("chaplin",comedy, 300);
        Video video4 = new Video("something hard", rock, 700);

        Audio audio1 = new Audio("Keshi", rnb, 180);
        Audio audio2 = new Audio("knights", rock, 180);

        rock.addVideo(video1);
        rock.addVideo(video4);
        rock.addAudio(audio2);

        comedy.addVideo(video3);
        comedy.addVideo(video2);


        Bid myBid = new Bid(500.0, "Me", video1);
        Bid yourBid = new Bid(900.0, "you", audio1);

        System.out.println(Genre.genre_count);
        System.out.println(Bid.allBidCount);
        rock.getRelatedVideos();
        rock.getRelatedAudios();

    }
}
