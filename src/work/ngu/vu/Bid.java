package work.ngu.vu;

public class Bid {
    private double bidAmount;
    private String user;
    private Video video;
    private Audio audio;
    public static int allBidCount = 0;

    public Bid(double bidAmount, String user, Video video) {
        this.bidAmount = bidAmount;
        this.user = user;
        this.video = video;
        allBidCount++;
    }

    public Bid(double bidAmount, String user, Audio audio) {
        this.bidAmount = bidAmount;
        this.user = user;
        this.audio = audio;
        allBidCount++;
    }

    public double getBidAmount() {
        return bidAmount;
    }

    public String getUser() {
        return user;
    }

    public Video getVideo() {
        return video;
    }

}
