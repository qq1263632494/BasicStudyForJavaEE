package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class BaseController {
    @RequestMapping(value = "/{action}")
    public String doSomeThing(@PathVariable String action, String locale, HttpServletRequest request){
        if(locale.equals("zh_CN")){
            Locale local = new Locale("zh", "CN");
            request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, local);
        }
        return action;
    }
}
