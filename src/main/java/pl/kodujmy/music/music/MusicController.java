package pl.kodujmy.music.music;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

        return "index";
    }

}
