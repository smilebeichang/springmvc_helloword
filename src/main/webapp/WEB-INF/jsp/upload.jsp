<%--
  Created by IntelliJ IDEA.
  User: songb
  Date: 2020/4/12
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <form action="/upload" method="post" enctype="multipart/form-data">
        desc:<input type="text" name="desc">
        <input type="file" name="file">
        <input type="submit" value="提交">
    </form>

</body>
</html>
