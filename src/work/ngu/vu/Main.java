package work.ngu.vu;

public class Main {
    public static void main(String[] args){
        //GENRES
        Genre rock = new Genre("Rock", "something manly");
        Genre comedy = new Genre("Comedy", "something funny");
        Genre pop = new Genre("R&B","somthing vibing");
        {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        //VIDEOS
        Video video1 = new Video("screaming potato", rock, 60);
        Video video2 = new Video("haleluya", comedy, 50);
        Video video3 = new Video("chaplin",comedy, 300);
        Video video4 = new Video("something hard", rock, 700);

        //AUDIOS
        Audio audio1 = new Audio("Keshi", pop, 180);
        Audio audio2 = new Audio("knights", rock, 180);
        Audio audio3 = new Audio("MVP", pop, 800);
        Audio audio4 = new Audio("hieu2", rock, 240);

        {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }

        //to List of Videos GENRES
        rock.addVideo(video1);
        rock.addVideo(video4);
        comedy.addVideo(video2);
        comedy.addVideo(video3);

        //to List of Audios GENRES
        rock.addAudio(audio2);
        rock.addAudio(audio4);
        pop.addAudio(audio1);
        pop.addAudio(audio3);

        //BIDS
        Bid one_Bid = new Bid(500.0, "Me", video1);
        Bid two_Bid = new Bid(900.0, "you", audio1);
        Bid three_Bid = new Bid(5000, "Tung", audio3);


        rock.getRelatedVideos();
        System.out.println();
        rock.getRelatedAudios();
        System.out.println();

        System.out.println(Genre.genre_count);
        System.out.println(Bid.allBidCount);

        System.out.println(video3.getDuration());
    }
}
