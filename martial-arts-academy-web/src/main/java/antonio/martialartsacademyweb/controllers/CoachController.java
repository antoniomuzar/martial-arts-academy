package antonio.martialartsacademyweb.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoachController {

    @RequestMapping({"/coaches","/coaches/index","coaches/index.html"})
    public String coaches(){

        return "coaches";
    }

}
