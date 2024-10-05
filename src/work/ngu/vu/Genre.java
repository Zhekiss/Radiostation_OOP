package work.ngu.vu;


import java.util.ArrayList;

public class Genre {
   private String name;
   private String description;
   private ArrayList<Video> videos;
   public static int genre_count;

   public Genre(String name, String description) {
      this.name = name;
      this.description = description;
      this.videos = new ArrayList<>();
      genre_count++;
   }

   public String getName() {
      return name;
   }

   public String getDescription() {
      return description;
   }

   public void addVideo(Video video) {
      videos.add(video);
   }

   public ArrayList<Video> getRelatedVideos(){
      return videos;
   }
   public int howManyGenresInList(){
      return genre_count;
   }
}
