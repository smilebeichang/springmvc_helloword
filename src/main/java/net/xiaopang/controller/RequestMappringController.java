package net.xiaopang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-10 22:02
 **/
@Controller
public class RequestMappringController {

    @RequestMapping("/h3")
    public ModelAndView hello3(ModelAndView modelAndView){
        modelAndView.addObject("msg","hello RequestMapping");
        modelAndView.setViewName("helloWorld");
        return modelAndView;
    }

    /**
     * 意味着一个controller中的一个方法等价于servlet
     * */
    @RequestMapping("/h4")
    public ModelAndView hello4(ModelAndView modelAndView){
        modelAndView.addObject("msg","hello RequestMapping");
        modelAndView.setViewName("helloWorld");
        return modelAndView;
    }

    /**
     * 精简版
     */
    @RequestMapping("/h5")
    public String hello5(Map map){
        map.put("msg","hello RequestMapping");
        return "helloWorld";
    }
}


