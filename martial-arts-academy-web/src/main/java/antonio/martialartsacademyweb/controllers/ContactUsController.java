package antonio.martialartsacademyweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactUsController {

        @RequestMapping({"/contact","/contact/index","/contact/index.html","/contact.html"})

        public String about(){

            return "contact/index";
        }
    }

