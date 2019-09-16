package controller;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping(value = "register")
    public ModelAndView register(@RequestParam(name = "name") String name, @RequestParam(name = "pass") String pass){
        ModelAndView mv = new ModelAndView();
        try{
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
            SqlSession session = factory.openSession();
            User user = new User();
            user.setName(name);
            user.setPass(pass);
            session.insert("mapper.save", user);
            session.commit();
            session.close();
            mv.addObject("msg", "注册成功");
        }catch (Exception e){
            e.printStackTrace();
            mv.addObject("msg", "注册失败");
        }
        mv.setViewName("registerResult");
        return mv;
    }
}
