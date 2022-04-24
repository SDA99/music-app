package pl.kodujmy.music.music;

import javax.persistence.*;

@Entity
@Table(name="perfect_music")
public class PerfectMusicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String author;
    private String title;
    private String imageUrl;

    public PerfectMusicEntity(long id, String author, String title, String imageUrl) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public PerfectMusicEntity() {
    }

    public long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public PerfectMusic toModel() {
        return new PerfectMusic(this.author, this.title, this.imageUrl);
    }
}
