package net.xiaopang.controller;

import net.xiaopang.service.BaseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-12 14:10
 **/
@Controller
public class UploadFileController extends Log4JController {

    @RequestMapping("to_upload")
    public String toUpload(){
        return "upload";
    }

    @RequestMapping("/upload")
    public String upload(String desc, MultipartFile file){
        logger.debug(desc);
        logger.debug(file.getOriginalFilename());
        return "success";
    }

}


