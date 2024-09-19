package work.ngu.vu;

public class Bid {
    private double bidAmount;
    private String user;
    private Video video;

    public Bid(double bidAmount, String user, Video video) {
        this.bidAmount = bidAmount;
        this.user = user;
        this.video = video;
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

    public float updateBidAmount(float newBid) {
        return newBid;
    }
}
