package work.ngu.vu;


import java.util.ArrayList;

public class Genre {
   private final String name;
   private final String description;
   private static ArrayList<Video> videos;
   private static ArrayList<Audio> audios;
   public static int genre_count;

   static {
      videos = new ArrayList<>();
      audios = new ArrayList<>();
      genre_count = 0;
   }
   //non_static
   {
      genre_count++;
   }

   public Genre(String name, String description) {
      this.name = name;
      this.description = description;
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

   public void addAudio(Audio audio) {
      audios.add(audio);
   }

   public static int howManyGenres(){
      return genre_count;
   }


   public void getRelatedVideos(){
      if(!videos.isEmpty()) {
         System.out.println("All Videos with this genre: ");
         for (Video video : videos) {
            System.out.println(video.getTitle());
         }
         System.out.println();
      } else {
         System.out.println("There aren't any videos with this genre.");
         System.out.println();
      }
   }
   public void getRelatedAudios(){
      if(!audios.isEmpty()) {
         System.out.println("All Audios with this genre: ");
         for (Audio audio : audios) {
            System.out.println(audio.getTitle());
         }
         System.out.println();
      } else {
         System.out.println("There aren't any videos with this genre.");
         System.out.println();
      }
   }

}
