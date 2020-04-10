package net.xiaopang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-10 23:36
 **/
@Controller
@RequestMapping("/req")
public class RequestParamController extends Log4JController {


    @RequestMapping("/to_reqParam")
    public String to(){
        return "requestParam";
    }

    /**
     * RequestParam 用法如果参数名相同，则可以省略
     * require defaultValue 后者一般用在页码
     */
    @RequestMapping("/reqParam")
    public String reqParam(@RequestParam("name")String name,@RequestParam("id") Integer id){
        logger.debug("请求参数:"+name+"  "+id);
        return "success";
    }

}


