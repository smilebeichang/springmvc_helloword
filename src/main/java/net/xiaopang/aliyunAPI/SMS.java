package net.xiaopang.aliyunAPI;

import net.xiaopang.util.HttpUtils;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-11 22:47
 **/
@Controller
public class SMS {

    public static void main(String[] args) {
        String host = "https://34sms.market.alicloudapi.com";
        String path = "/SmsSend";
        String method = "POST";
        String appcode = "65bc4ed64657440a96ed6d5b62e6399e";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        //17551055083
        querys.put("Mobiles", "17551055083");
        querys.put("Tags", "小胖在干嘛呢？");
        querys.put("TempId", "M633864F59");
        Map<String, String> bodys = new HashMap<String, String>();


        try {
            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            System.out.println("==============="+response.toString());
            //获取response的body
            System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}


