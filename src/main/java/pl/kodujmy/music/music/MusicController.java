package pl.kodujmy.music.music;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MusicController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

}
