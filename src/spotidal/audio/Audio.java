package spotidal.audio;

public class Audio {
    private int listeners;
    private int favorites;
    private int monthListeners;
    protected static int duration;
    private String genre;
    protected String title;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getListeners() {
        return listeners;
    }

    public void setListeners(int listeners) {
        this.listeners = listeners;
    }

    public int getFavorites() {
        return favorites;
    }

    public void setFavorites(int favorites) {
        this.favorites = favorites;
    }

    public int getMonthListeners() {
        return monthListeners;
    }

    public void setMonthListeners(int monthListeners) {
        this.monthListeners = monthListeners;
    }


    public static int getDuration() {
        return duration;
    }

    public static void setDuration(int duration) {
        Audio.duration = duration;
    }
    public void like(){
        this.favorites++;
    }
    public void played(){
        this.listeners++;
    }
}
