package pl.kodujmy.music.music;

public class PerfectMusicInMemoryService implements PerfectMusicService {
    @Override
    public PerfectMusic recommend() {
        return new PerfectMusic("Viva La Vida", "Coldplay", "https://www.cgm.pl/wp-content/uploads/2021/10/Coldplay.jpg");
    }

    @Override
    public PerfectMusic info(String artist) {
        return new PerfectMusic(artist + " song", artist, "https://www.cgm.pl/wp-content/uploads/2021/10/Coldplay.jpg");
    }
}
