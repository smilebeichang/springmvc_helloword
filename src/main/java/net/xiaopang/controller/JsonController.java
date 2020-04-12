package net.xiaopang.controller;

import net.xiaopang.dto.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-12 10:52
 **/
@Controller
public class JsonController {
    @RequestMapping("to_json")
    public String toJson(){
        return "json";
    }

    @RequestMapping("respondJson")
    @ResponseBody
    public Student Json(){
        Student student = new Student("xiaopang",16,"南京");
        return student;
    }


    @RequestMapping(value = "getJsonString",method = RequestMethod.POST)
    @ResponseBody
    public Student getJson(@RequestBody Student student){
        return student;
    }
}



