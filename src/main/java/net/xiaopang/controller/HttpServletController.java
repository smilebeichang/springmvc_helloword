package net.xiaopang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-11 00:16
 **/
@Controller
@RequestMapping("/htpServlet")
public class HttpServletController extends Log4JController{

    @RequestMapping("/do")
    public String httpServlet(HttpServletRequest request, HttpServletResponse response){

        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            logger.info(cookie.getName()+" -- "+cookie.getValue());
        }
        logger.warn("================");
        Cookie cookie = new Cookie("name","xiaopang");
        cookie.setMaxAge(3600);
        response.addCookie(cookie);
        return "success";
    }
}



