package pl.kodujmy.music.music;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.net.http.HttpResponse;
import java.util.Random;

@Controller
public class MusicController {

    private final PerfectMusicService perfectMusicService;

    public MusicController(PerfectMusicService perfectMusicService) {
        this.perfectMusicService = perfectMusicService;
    }

    @RequestMapping("/")
    public ResponseEntity<String> index(Model model, @RequestParam(defaultValue = "coldplay") String artist) {
        PerfectMusic perfectMusic = perfectMusicService.info(artist);
        model.addAttribute("perfectMusic", perfectMusic);
        model.addAttribute("color", getRandomColor());

        return ResponseEntity.ok("index");
    }

    private String getRandomColor() {
        Random random = new Random();
        int nextInt = random.nextInt(0xffffff + 1);
        String colorCode = String.format("#%06x", nextInt);
       return colorCode;
    }


}
