package antonio.martialartsacademy.controllers;

import antonio.martialartsacademy.model.AmateurFighter;
import antonio.martialartsacademy.model.Contact;
import antonio.martialartsacademy.services.ContactService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class ContactUsController {

        private static final String CONTACT_INDEX_URL= "contact/index";


        private final ContactService contactService;

    public ContactUsController(ContactService contactService) {
        this.contactService = contactService;
    }


    @RequestMapping({"/contact","/contact/index","/contact/index.html","/contact.html"})

    public String contact(){

        return "/contact/index";
    }

    @GetMapping("contact/new")
    public String newContact(Model model){
        model.addAttribute("contact", new Contact());

        return "contact/index";
    }


    @PostMapping("contact")
    public String saveOrUpdate(@Validated @ModelAttribute("contact") Contact contact, BindingResult bindingResult){

        if(bindingResult.hasErrors()){

            bindingResult.getAllErrors().forEach(objectError -> {
                log.debug(objectError.toString());
            });

            return CONTACT_INDEX_URL;
        }

        Contact savedContact = contactService.save(contact);

        return "/contact/success";
    }


    }

