package net.xiaopang.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.*;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-10 21:12
 **/
@org.springframework.stereotype.Controller("/helloWorldController")
public class HelloWorldController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "helloWord");
        modelAndView.setViewName("helloWorld");
        return modelAndView;
    }
}



