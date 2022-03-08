package antonio.martialartsacademy.controllers;

import antonio.martialartsacademy.model.AmateurFighter;
import antonio.martialartsacademy.services.AmateurFighterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class AmateurFighterController {

    private static final String AMATEURFIGHTER_AMATEURFIGHTERFORM_URL= "amateurFighters/signupform";

    private final AmateurFighterService amateurFighterService;

    public AmateurFighterController(AmateurFighterService amateurFighterService) {
        this.amateurFighterService = amateurFighterService;
    }


    @GetMapping("amateurFighters/new")
    public String newAmateurFighter(Model model){
        model.addAttribute("amateurFighters", new AmateurFighter());

        return "/amateurFighters/signupform";
    }


    @PostMapping("amateurFighters")
    public String saveOrUpdate(@Validated @ModelAttribute("amateurFighters") AmateurFighter amateurFighter, BindingResult bindingResult){

        if(bindingResult.hasErrors()){

            bindingResult.getAllErrors().forEach(objectError -> {
                log.debug(objectError.toString());
            });

            return AMATEURFIGHTER_AMATEURFIGHTERFORM_URL;
        }

        AmateurFighter savedAmateurFighter = amateurFighterService.save(amateurFighter);

        return "/amateurFighters/success";
    }
}
