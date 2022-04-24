package pl.kodujmy.music.music;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfectMusicRepository extends JpaRepository<PerfectMusicEntity, Long> {
}
