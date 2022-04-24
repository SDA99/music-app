package pl.kodujmy.music.music;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.NoSuchElementException;
import java.util.Optional;

public class PerfectMusicDBService implements PerfectMusicService{

    @Autowired
    private PerfectMusicRepository perfectMusicRepository;

    @Override
    public PerfectMusic recommend() {
        Optional<PerfectMusicEntity> byId = perfectMusicRepository.findById(1l);

        if(byId.isEmpty()) {
            throw new NoSuchElementException("Couldn't find msuic with id 1");
        }
        return byId.get().toModel();
    }
}
