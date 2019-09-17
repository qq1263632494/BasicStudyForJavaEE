package controller;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class UserController {
    private SqlSessionFactory factory;
    public UserController(){
        try{
            this.factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @RequestMapping(value = "register")
    public ModelAndView register(@RequestParam(name = "name") String name, @RequestParam(name = "pass") String pass){
        ModelAndView mv = new ModelAndView();
        try(SqlSession session = factory.openSession();){
            User user = new User();
            user.setName(name);
            user.setPass(pass);
            session.insert("mapper.save", user);
            session.commit();
            mv.addObject("msg", "注册成功");
        }catch (Exception e){
            e.printStackTrace();
            mv.addObject("msg", "注册失败");
        }
        mv.setViewName("registerResult");
        return mv;
    }
    @RequestMapping(value = "lookup")
    public ModelAndView lookup(@RequestParam(name = "name") String name){
        System.out.println("开始查询");
        ModelAndView mv = new ModelAndView();
        try(SqlSession session = factory.openSession()){
            User user = session.selectOne("mapper.queryByName", name);
            System.out.println(user);
            mv.addObject("msg", "查询成功");
            mv.addObject("name", user.getName());
            mv.addObject("pass", user.getPass());
        }catch (Exception e){
            e.printStackTrace();
            mv.addObject("msg", "查询失败");
        }
        mv.setViewName("queryResult");
        return mv;
    }
    @RequestMapping(value = "update")
    public ModelAndView updateUser(@RequestParam(name = "name") String name,
                                   @RequestParam(name = "pass") String pass)
    {
        ModelAndView mv = new ModelAndView();
        try(SqlSession session = factory.openSession()){
            if(session.selectOne("mapper.queryByName", name)!=null){
                User user = new User();
                user.setName(name);
                user.setPass(pass);
                session.update("mapper.update", user);
                session.commit();
                mv.addObject("msg", "成功");
            }else {
                mv.addObject("msg", "用户不存在");
            }
        }catch (Exception e){
            e.printStackTrace();
            mv.addObject("msg", "失败");
        }
        mv.setViewName("updateResult");
        return mv;
    }
    @RequestMapping(value = "delete")
    public ModelAndView deleteUser(@RequestParam(name = "name") String name,
                                   @RequestParam(name = "pass") String pass)
    {
        ModelAndView mv = new ModelAndView();
        try(SqlSession session = factory.openSession()){
            if(session.selectOne("mapper.queryByName", name)!=null){
                User user = new User();
                user.setName(name);
                user.setPass(pass);
                session.delete("mapper.delete", user);
                session.commit();
                mv.addObject("msg", "删除成功");
            }else {
                mv.addObject("msg", "用户不存在");
            }
        }catch (Exception e){
            mv.addObject("msg", "删除失败");
        }
        mv.setViewName("deleteResult");
        return mv;
    }
}
