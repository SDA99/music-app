package pl.kodujmy.music.music;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class MusicRestController {

    private static List<PerfectMusic> musicRepo = new ArrayList<>();

    static {
        musicRepo.add(new PerfectMusic("Coldplay.jpg", "Coldplay"));
        musicRepo.add(new PerfectMusic("U2.jpg", "U2"));
        musicRepo.add(new PerfectMusic("Red_Hot_Chilli_Peppers.jpg", "Red Hot Chilli Peppers"));
    }

    @GetMapping(value = {"/api/musics"})
    public ResponseEntity<List<PerfectMusic>> getMusic() {
        return ResponseEntity.ok(musicRepo);
    }

    @GetMapping(value = {"/api/musics/{id}"})
    public ResponseEntity<PerfectMusic> getExample(@PathVariable(required = false) Integer id, @RequestParam(name = "genre", defaultValue = "jazz") String genre) {
        if (id == null || musicRepo.size() <= id) {
            return new ResponseEntity("Id of band required", HttpStatus.BAD_REQUEST);
        } else {
            return ResponseEntity.ok(musicRepo.get(id));
        }
    }

    @PostMapping(value = "/api/musics", produces = "application/json")
    public ResponseEntity<PerfectMusic> addMusic(@RequestBody PerfectMusic music, BindingResult result) {

        if (music == null || music.getAuthor() == null) {
            return new ResponseEntity("Invalid object ", HttpStatus.BAD_REQUEST);
        }
        musicRepo.add(music);
        return ResponseEntity.ok(music);
    }
}
