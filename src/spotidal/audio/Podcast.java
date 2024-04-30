package spotidal.audio;

public class Podcast extends Audio {
    private String presenter;
    private String guest;
    private String Episode;

    @Override
    public String toString() {
        return String.format(
                "Podcast: %s " +
                "\nConvidado: %s " +
                "\nEpisodio: %s " +
                "\nDuração: %s horas"


                ,this.title,
                this.guest,
                this.Episode,
                this.getDuration());
    }


    public String getEpisode() {
        return Episode;
    }

    public void setEpisode(String episode) {
        Episode = episode;
    }

    public String getPresenter() {
        return presenter;
    }

    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }
}
