package net.xiaopang.aliyunAPI;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import net.xiaopang.util.HttpUtils;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-11 23:27
 **/
public class Weather {
    public static void main(String[] args) {
        String host = "http://aliv18.data.moji.com";
        String path = "/whapi/json/alicityweather/condition";
        String method = "POST";
        String appcode = "65bc4ed64657440a96ed6d5b62e6399e";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        //根据API的要求，定义相对应的Content-Type
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        Map<String, String> querys = new HashMap<String, String>();
        Map<String, String> bodys = new HashMap<String, String>();
        bodys.put("cityId", "1052");
        bodys.put("token", "50b53ff8dd7d9fa320d3d3ca32cf8ed1");


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
            System.out.println(response.toString());
            //获取response的body
            System.out.println(EntityUtils.toString(response.getEntity()));

           /* String w= EntityUtils.toString(response.getEntity());
            List<Object> list = JSON.parseArray(w);
            for (Object s:list) {
                System.out.println(((JSONObject)s).getString("data"));
            }*/

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


