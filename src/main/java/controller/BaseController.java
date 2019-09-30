package controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class BaseController {
    private static final Log logger = LogFactory.getLog(FormatTester.class);
    @RequestMapping(value = "/{action}")
    public String doSomeThing(@PathVariable String action, String locale, HttpServletRequest request){
        if(locale.equals("zh_CN")){
            Locale local = new Locale("zh", "CN");
            request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, local);
        }
        return action;
    }
    @RequestMapping(value = "/formatTest")
    public String formatTest(@ModelAttribute FormatTester tester,
                             Model model){
        logger.info(tester);
        model.addAttribute("tester", tester);
        return "formatResult";
    }
    @Autowired
    @Qualifier("testerValidator")
    private TesterValidator testerValidator;
    @RequestMapping(value = "/validationTest")
    public String validationTest(@ModelAttribute ValidationTester tester,
                                 Model model,
                                 Errors errors){
        logger.info(tester);
        model.addAttribute("tester", tester);
        model.addAttribute("command", tester);
        testerValidator.validate(tester, errors);
        System.out.println("complete");
        if(errors.hasErrors()){
            return "validation";
        }
        return "validationResult";
    }

    @RequestMapping(value = "/validation")
    public String validation(Model model){
        System.out.println("???");
        ValidationTester tester = new ValidationTester();
        model.addAttribute("tester", tester);
        model.addAttribute("command", tester);
        return "validation";
    }
}
