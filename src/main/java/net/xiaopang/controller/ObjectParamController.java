package net.xiaopang.controller;

import net.xiaopang.dto.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-11 00:01
 **/
@Controller
@RequestMapping("/obj")
public class ObjectParamController extends Log4JController {
    @RequestMapping("to_receive")
    public String toReceive(){
        return "object_param";
    }

    @RequestMapping(value = "receive" ,method= RequestMethod.PUT)
    public String receive(Student student){
        logger.info(student.toString());
        return "success";
    }

    @RequestMapping("/to_ce")
    protected  String toCe(String username){
        logger.debug(username);
        return "CharacterEncoding";
    }

    @RequestMapping("/ce")
    protected  String CharacterEncoding(String username){
        logger.debug(username);
        return "success";
    }

}


