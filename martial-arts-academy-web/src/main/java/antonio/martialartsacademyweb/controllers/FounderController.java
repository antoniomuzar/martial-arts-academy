package antonio.martialartsacademyweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FounderController {


    @RequestMapping({"/founders", "/founders/index", "/founders/index.html"})
    private String founders(){

        return "founders";
    }
}
