package pl.kodujmy.music.music;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AudioDBArtist {

    private String strArtist;
    private String strStyle;
    private String strArtistBanner;
    private String strLabel;

    public AudioDBArtist() {
    }

    public AudioDBArtist(String strArtist, String strStyle, String strArtistBanner, String strLabel) {
        this.strArtist = strArtist;
        this.strStyle = strStyle;
        this.strArtistBanner = strArtistBanner;
        this.strLabel = strLabel;
    }

    public String getStrArtist() {
        return strArtist;
    }

    public String getStrStyle() {
        return strStyle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AudioDBArtist that = (AudioDBArtist) o;
        return Objects.equals(strArtist, that.strArtist) && Objects.equals(strStyle, that.strStyle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strArtist, strStyle);
    }

    @Override
    public String toString() {
        return "AudioDBArtist{" +
                "strArtist='" + strArtist + '\'' +
                ", strStyle='" + strStyle + '\'' +
                '}';
    }

    public String getStrArtistBanner() {
        return strArtistBanner;
    }

    public String getStrLabel() {
        return strLabel;
    }
}
