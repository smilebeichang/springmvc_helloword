<%--
  Created by IntelliJ IDEA.
  User: songb
  Date: 2020/4/12
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>响应JSON</title>
    <script type="text/javascript" src="/js/jquery-1.10.2.js"></script>
    <script>
        $(function () {
            //js对象
            var user = {
                userName:'pang',
                address:'jing'
            };
            //json对象
            var student = {
                'name':'xiao',
                'age':18,
                'address':'nan'
            };
            //json 字符串
            console.log(JSON.stringify(user));
            $.ajax({
                url:'respondJson',
                //method:'POST'   //默认GET type
                data:{},
                async:true,
                //默认string
                dataType:'json',
                success:function (result) {
                    console.log('======'+result);
                    //result='{name: "xiaopang", age: 16, address: "南京", birthday: null}';
                },
                error:function (e) {
                    console.log();
                    /**
                     e.toString()：  获得异常种类和错误信息    java.lang.ArithmeticException: / by zero
                     e.getMessage():获得错误信息    / by zero
                     e.printStackTrace()：在控制台打印出异常种类，错误信息和出错位置等
                     */
                }
               /* ,
                error:function(data,type, err){
                    console.log("ajax错误类型："+type);
                    console.log(err);
                },
                error : function (XMLHttpRequest, textStatus, errorThrown) {
                    console.log("错误");
                    // 状态码
                    console.log(XMLHttpRequest.status);
                    // 状态
                    console.log(XMLHttpRequest.readyState);
                    // 错误信息
                    console.log(textStatus);
                }*/
            });
            $.ajax({
                url:'getJsonString',
                method:'POST',   //默认GET type
                data:JSON.stringify(student),
                async:true,
                //传过去的类型
                contentType:'application/json;charset=utf-8',
                //默认string
                dataType:'json',
                success:function (result) {
                    console.log(result);
                },
                error:function (e) {
                    console.log();
                }

            })
        })
    </script>


</head>
<body>
    <span>看控制台</span>
</body>
</html>
