<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 2019/9/16
  Time: 下午9:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>简单主页</title>
  </head>
  <body>
    <form action="/simple" method="post">
      <label for="msg">输入消息：</label>
      <input type="text" id="msg" name="msg"/>
      <button type="submit">提交</button>
    </form>
  </body>
</html>
