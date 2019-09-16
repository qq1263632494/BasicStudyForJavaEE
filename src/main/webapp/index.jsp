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
    <link href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.css" rel="stylesheet">
  </head>
  <body>
    <div class="container">
      <form action="/simple" method="post" class="form">
        <div class="form-group">
          <label for="msg" class="form-label">输入消息：</label>
          <input type="text" id="msg" name="msg" class="form-control"/>
        </div>
        <button type="submit" class="btn btn-primary">提交</button>
      </form>
    </div>
  </body>
</html>
