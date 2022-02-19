package antonio.martialartsacademyweb.controllers;

import antonio.martialartsacademydata.services.CoachService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoachController {

    private final CoachService coachService;


    public CoachController(CoachService coachService) {
        this.coachService = coachService;
    }

    @RequestMapping({"/coaches","/coaches/index", "/coaches/index.html","/coaches.html"})
    public String listCoaches(Model model){

        model.addAttribute("coaches" ,coachService.findAll());

        return "coaches/index";
    }

}
