package antonio.martialartsacademyweb.controllers;

import antonio.martialartsacademydata.services.FighterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FighterController {

    private final FighterService fighterService;

    public FighterController(FighterService fighterService) {
        this.fighterService = fighterService;
    }

    @GetMapping({"/fighters","/fighters/index","/fighters/index.html"})
    public String fighters(Model model){


        return "fighters/index";


    }

}