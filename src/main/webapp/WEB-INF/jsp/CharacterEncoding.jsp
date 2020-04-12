<%--
  Created by IntelliJ IDEA.
  User: songb
  Date: 2020/4/11
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表单提交乱码</title>
</head>
<body>
    <form action="/obj/ce" method="post">
        <input type="hidden" name="username" value="张三">
        <input type="submit" value="提交">
    </form>
</body>
</html>
