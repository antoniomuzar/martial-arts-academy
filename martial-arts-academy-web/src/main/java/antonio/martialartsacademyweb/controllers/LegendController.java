package antonio.martialartsacademyweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LegendController {

    @RequestMapping({"/legends", "/legends/index", "/legends/index.html"})
    private String legends(){

        return "legends";
    }
}
