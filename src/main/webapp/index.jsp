<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/25
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="/say.action">跳转</a><br>

    <form action="/adduser.action" method="post">
        用户名：<input type="text" name="uname"><br>
        密码：<input type="text" name="upwd"><br>
        <input type="submit" value="提交"><br>
    </form><br>

    <a href="/getuser.action">获取数据</a><br>



</body>
</html>
