<%--
  Created by IntelliJ IDEA.
  User: songb
  Date: 2020/4/10
  Time: 22:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求方式</title>
</head>
<body>
    <form action="/h8" method="POST">
        userName:<input type="text" name="userName">
        password:<input type="text" name="password">
        <input type="submit" value="提交">
    </form>
    <form action="/rest" method="POST">
        <input type="submit" value="POST提交">
    </form>
    <form action="/rest" method="get">
        <input type="submit" value="GET提交">
    </form>
    <form action="/rest" method="POST">
        <input type="hidden" name="_method" value="DELETE">
        <input type="submit" value="DELETE提交">
    </form>
    <form action="/rest" method="POST">
        <input type="hidden" name="_method" value="PUT">
        <input type="submit" value="UPDATE提交">
    </form>
</body>
</html>
