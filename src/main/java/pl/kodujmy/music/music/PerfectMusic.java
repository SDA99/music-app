package pl.kodujmy.music.music;

public class PerfectMusic {

    private String image;
    private String author;


    public PerfectMusic(String image, String author) {
        this.image = image;
        this.author = author;
    }


    public String getAuthor() {
        return author;
    }

    public String getImage() {
        return image;
    }
}
