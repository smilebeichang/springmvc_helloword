<%--
  Created by IntelliJ IDEA.
  User: songb
  Date: 2020/4/10
  Time: 23:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>使用对象接收参数</title>
</head>
<body>

    <form action="/obj/receive" method="post">
        <label>name:</label><input type="text" name="name"><BR>
        <label>age:</label><input type="text" name="age"><BR>
        <label>address:</label><input type="text" name="address"><BR>
        <label>birthday:</label><input type="date" name="birthday"><BR>
        <input type="hidden" name="_method" value="put">
        <input type="submit" value="提交">
    </form>

</body>
</html>
