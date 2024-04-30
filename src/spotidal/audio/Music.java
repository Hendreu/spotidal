package spotidal.audio;

public class Music extends Audio {
    private String album;
    private boolean single;
    private String band;
    private String singer;
    private String title;

    @Override
    public String toString() {
        return String.format(
                "Musica: %s " +
                "\nBanda: %s " +
                "\nAlbum: %s " +
                "\nDuração: %s minutos e 2 segundos"
                ,this.title, this.band, this.album, this.getDuration());
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public boolean isSingle() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}