package antonio.martialartsacademy.controllers;

import antonio.martialartsacademy.model.AmateurFighter;
import antonio.martialartsacademy.services.AmateurFighterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class AboutUsController {


    private static final String AMATEURFIGHTER_AMATEURFIGHTERFORM_URL= "about/signupform";

    private final AmateurFighterService amateurFighterService;


    public AboutUsController(AmateurFighterService amateurFighterService) {
        this.amateurFighterService = amateurFighterService;
    }

    @RequestMapping({"/about","/about/index","/about/index.html","/about.html"})

        public String about(){

            return "about/index";
        }


    @GetMapping("about/new")
    public String newAmateurFighter(Model model){
        model.addAttribute("about", new AmateurFighter());

        return "about/signupform";
    }


    @PostMapping("about")
    public String saveOrUpdate(@Validated @ModelAttribute("about") AmateurFighter amateurFighter, BindingResult bindingResult){

        if(bindingResult.hasErrors()){

            bindingResult.getAllErrors().forEach(objectError -> {
                log.debug(objectError.toString());
            });

            return AMATEURFIGHTER_AMATEURFIGHTERFORM_URL;
        }

        AmateurFighter savedAmateurFighter = amateurFighterService.save( amateurFighter);

        return "/about/success";
    }
    }


