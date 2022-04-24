package pl.kodujmy.music.music;

public class PerfectMusic {

    private String image;
    private String author;
    private String title;


    public PerfectMusic(String author, String title, String url) {
        this.title = title;
        this.author = author;
        this.image = url;
    }


    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }
}
