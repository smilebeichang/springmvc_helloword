package net.xiaopang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-10 22:54
 **/
@Controller
@RequestMapping("/rest")
public class RestController extends Log4JController {

    @RequestMapping(method = RequestMethod.GET)
    public String get(){
        logger.error("------GET-------");
        return "success";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String post(){
        logger.error("------POST-------");
        return "success";
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public String delete(){
        logger.error("------DELETE-------");
        return "success";
    }

    @RequestMapping(method = RequestMethod.PUT)
    public String put(){
        logger.error("------PUT-------");
        return "success";
    }
}


