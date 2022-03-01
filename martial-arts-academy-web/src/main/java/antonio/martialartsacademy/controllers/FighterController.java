package antonio.martialartsacademy.controllers;

import antonio.martialartsacademy.model.Fighter;
import antonio.martialartsacademy.services.FighterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.webjars.NotFoundException;


@Slf4j
@Controller

public class FighterController {

    private static final String FIGHTER_FIGHTERFORM_URL = "fighters/fighterform";

    private final FighterService fighterService;


    public FighterController(FighterService fighterService) {

        this.fighterService = fighterService;
    }


    @RequestMapping({"/fighters","/fighters/index", "/fighters/index.html","/fighters.html"})
    public String listFighters(Model model){

        model.addAttribute("fighters" ,fighterService.findAll());

        return "fighters/index";
    }

    @GetMapping("/fighters/{id}/show")
    public String showById(@PathVariable String id, Model model){

        model.addAttribute("fighters", fighterService.findById(new Long(id)));

        return "fighters/show";
    }

    @GetMapping("fighters/new")
    public String newFighter(Model model){
        model.addAttribute("fighters", new Fighter());

        return "fighters/fighterform";
    }

    @GetMapping("fighters/{id}/update")
    public String updateFighter(@PathVariable String id, Model model){
        model.addAttribute("fighters", fighterService.findById(Long.valueOf(id)));
        return FIGHTER_FIGHTERFORM_URL;
    }

    @PostMapping("fighters")
    public String saveOrUpdate(@Validated @ModelAttribute("fighters") Fighter fighter, BindingResult bindingResult){

        if(bindingResult.hasErrors()){

            bindingResult.getAllErrors().forEach(objectError -> {
                log.debug(objectError.toString());
            });

            return FIGHTER_FIGHTERFORM_URL;
        }

        Fighter savedFighter = fighterService.save(fighter);

        return "redirect:/fighters/" + savedFighter.getId() + "/show";
    }

    @GetMapping("fighters/{id}/delete")
    public String deleteById(@PathVariable String id){

        log.debug("Deleting id: " + id);

        fighterService.deleteById(Long.valueOf(id));
        return "redirect:/fighters/index";
    }



}



