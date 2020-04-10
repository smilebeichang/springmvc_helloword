package net.xiaopang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-10 22:35
 **/
@Controller
public class AntController {
    @RequestMapping("/ant/add??")
    public String toAdd(){return "success";}
    @RequestMapping("/ant/add*")
    public String toSelect(){return "success";}
    @RequestMapping("/ant/add/**")
    public String toUpdate(){return "success";}
}



