<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 2019/9/16
  Time: 下午9:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head>
    <title>简单主页</title>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.css" rel="stylesheet">
  </head>
  <body>
    <div class="container">
      <form action="${pageContext.request.contextPath}/register" method="post" class="form">
        <div class="form-group">
          <label for="msg" class="form-label">账号：</label>
          <input type="text" id="msg" name="name" class="form-control"/>
        </div>
        <div class="form-group">
          <label for="msg1" class="form-label">密码：</label>
          <input type="text" id="msg1" name="pass" class="form-control"/>
        </div>
        <button type="submit" class="btn btn-primary">注册</button>
      </form>
      <a href="${pageContext.request.contextPath}/query?locale=zh_CN">查询用户</a>
      <br>
      <a href="${pageContext.request.contextPath}/updateView?locale=zh_CN">更改用户</a>
      <br>
      <a href="${pageContext.request.contextPath}/deleteView?locale=zh_CN">删除用户</a>
      <br>
      <a href="${pageContext.request.contextPath}/selectMap">简单测试</a>
      <br>
      <a href="${pageContext.request.contextPath}/selectList">简单测试2</a>
      <br>
      <a href="${pageContext.request.contextPath}/format?locale=zh_CN">格式化测试</a>
      <br>
      <a href="${pageContext.request.contextPath}/validation?locale=zh_CN">校验测试</a>
      <br>
      <a href="${pageContext.request.contextPath}/JSRValidator">JSR303校验测试</a>
    </div>
  </body>
</html>
