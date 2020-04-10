package net.xiaopang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-10 22:22
 **/
@Controller
public class RequestMethodController {

    /**
     * 可以加斜杆也可以不加
     * */
    @RequestMapping(value = "h7",method = RequestMethod.GET)
    public String doGet(){
        return "success";
    }

    @RequestMapping(value = "h8",method = RequestMethod.POST)
    public String doPost(){
        return "success";
    }

}


