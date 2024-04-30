import spotidal.audio.Music;
import spotidal.audio.Podcast;

public class Main{
   public static void main(String[] args){
   Music CTE = new Music();
   CTE.setTitle("Zero");
   CTE.setBand("Crown the empire");
   CTE.setAlbum("Retrograde");
   CTE.setSingle(false);
   CTE.setDuration(180 / 60/* e 2 sec*/);
   CTE.setMonthListeners(25000);
   CTE.setGenre("Metalcore");
       System.out.println(CTE + "\n");

   Podcast flow = new Podcast();
   flow.setTitle("FlowPodCast");
   flow.setGuest("fer & FNX");
   flow.setEpisode("Campeões mundiais");
   flow.setDuration(3);
       System.out.println(flow);
  }
}
