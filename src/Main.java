import spotidal.audio.Music;

public class Main{
   public static void main(String[] args){
   Music CTE = new Music();
   CTE.setTitle("Zero");
   CTE.setBand("Crown the empire");
   CTE.setAlbum("Retrograde");
   CTE.setDuration(180 / 60/* e 2 sec*/);
       System.out.println(CTE);
  }
}
