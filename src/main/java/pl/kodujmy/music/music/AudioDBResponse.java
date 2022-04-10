package pl.kodujmy.music.music;

public class AudioDBResponse {

    private AudioDBArtist[] artists;

    public AudioDBResponse(AudioDBArtist[] artists) {
        this.artists = artists;
    }

    public AudioDBResponse() {
    }

    public AudioDBArtist[] getArtists() {
        return artists;
    }
}
