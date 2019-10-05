package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class ValidatorController {
    @RequestMapping(value = "/JSRValidator")
    public String jsrvalidator(Model model){
        JSRUser user = new JSRUser();
        model.addAttribute("user", user);
        System.out.println("step 1");
        return "JSRValidator";
    }
    @RequestMapping(value = "/JSRValidatorTest", method = RequestMethod.POST)
    public String validateJSR(
            @Valid @ModelAttribute JSRUser user,
            Errors errors,
            Model model
    ){
        System.out.println("step 2");
        if(errors.hasErrors()){
            model.addAttribute("user", user);
            System.out.println("step 2-1");
            return "JSRValidator";
        }
        model.addAttribute("user", user);
        return "success";
    }
}
