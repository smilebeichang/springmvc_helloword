package net.xiaopang.controller;

import org.apache.log4j.Logger;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-10 22:58
 **/
public abstract class Log4JController {
    protected Logger logger =null ;
    public Log4JController(){
        logger=Logger.getLogger(getClass().getName());
    }
}



