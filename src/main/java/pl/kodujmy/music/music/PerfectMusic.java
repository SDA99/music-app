package pl.kodujmy.music.music;

public class PerfectMusic {

    private String title;
    private String author;


    public PerfectMusic(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
