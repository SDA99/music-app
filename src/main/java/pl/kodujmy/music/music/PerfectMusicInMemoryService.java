package pl.kodujmy.music.music;

public class PerfectMusicInMemoryService implements PerfectMusicService {
    @Override
    public PerfectMusic recommend() {
        return new PerfectMusic("Viva La Vida", "Coldplay");
    }

    @Override
    public PerfectMusic info(String artist) {
        return new PerfectMusic(artist + " song", artist);
    }
}
