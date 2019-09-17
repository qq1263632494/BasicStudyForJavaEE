<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 2019/9/17
  Time: 上午10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询用户</title>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <form class="form" method="get" action="${pageContext.request.contextPath}/lookup">
            <div class="form-group">
                <label class="input-label" for="id">输入id</label>
                <input type="text" class="form-control" id="id" name="id"/>
            </div>
            <button class="btn btn-primary">开始查询</button>
        </form>
    </div>
</body>
</html>
