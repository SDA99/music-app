package pl.kodujmy.music.music;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfectMusicRepository extends JpaRepository<PerfectMusicEntity, Long> {

    @Query(value = "select * from perfect_music order by random() limit 1", nativeQuery = true)
    PerfectMusicEntity getRandom();
}
