package pl.kodujmy.music.music;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
public class MusicController {

    private final PerfectMusicService perfectMusicService;

    public MusicController(PerfectMusicService perfectMusicService) {
        this.perfectMusicService = perfectMusicService;
    }

    @RequestMapping("/")
    public String index(Model model) {

        PerfectMusic perfectMusic = perfectMusicService.recommend();
        model.addAttribute("perfectMusic", perfectMusic);
        model.addAttribute("color", getRandomColor());

        return "index";
    }

    private String getRandomColor() {
        Random random = new Random();
        int nextInt = random.nextInt(0xffffff + 1);
        String colorCode = String.format("#%06x", nextInt);
       return colorCode;
    }


}
