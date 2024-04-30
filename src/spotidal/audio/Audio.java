package spotidal.audio;

public class Audio {
    private int listeners;
    private int favorites;
    private int monthListeners;
    private boolean favorited;
    protected static int duration;
    private int classification;


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

    public boolean isFavorited() {
        return favorited;
    }

    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }

    public static int getDuration() {
        return duration;
    }

    public static void setDuration(int duration) {
        Audio.duration = duration;
    }

    public int getClassification() {
        return classification;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }
}
