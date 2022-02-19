package antonio.martialartsacademyweb.controllers;

import org.springframework.stereotype.Controller;
;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutUsController {


        @RequestMapping({"/about","/about/index","/about/index.html","/about.html"})

        public String about(){

            return "about/index";
        }
    }


