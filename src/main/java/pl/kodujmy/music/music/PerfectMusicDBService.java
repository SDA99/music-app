package pl.kodujmy.music.music;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.NoSuchElementException;
import java.util.Optional;

public class PerfectMusicDBService implements PerfectMusicService{

    @Autowired
    private PerfectMusicRepository perfectMusicRepository;

    @Override
    public PerfectMusic recommend() {
        PerfectMusicEntity entity = perfectMusicRepository.getRandom();

        return entity.toModel();
    }

    @Override
    public PerfectMusic info(String artist) {
        return null;
    }
}
