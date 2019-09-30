<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 2019/9/30
  Time: 上午10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>格式化测试</title>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <form class="form" action="/formatTest" method="post">
        <div class="form-group">
            <label for="birthday">日期类型</label>
            <input type="text" id="birthday" name="birthday" class="form-control">
            <label for="total">整数类型</label>
            <input type="text" id="total" name="total" class="form-control">
            <label for="discount">百分数类型</label>
            <input type="text" id="discount" class="form-control" name="discount">
            <label for="money">货币类型</label>
            <input type="text" id="money" name="money" class="form-control">
        </div>
        <button type="submit" class="btn btn-primary">提交</button>
    </form>
</div>
</body>
</html>
