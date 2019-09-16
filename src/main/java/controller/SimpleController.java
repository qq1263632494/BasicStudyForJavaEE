package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleController {
    @RequestMapping(value = "simple")
    public ModelAndView simpleMethod(@RequestParam(name = "msg") String msg){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", msg);
        mv.setViewName("welcome");
        return mv;
    }
}
