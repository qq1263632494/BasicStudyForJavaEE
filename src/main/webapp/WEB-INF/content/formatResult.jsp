<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 2019/9/30
  Time: 上午10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>格式化结果</title>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<form:form modelAttribute="tester" method="post">
    <table class="table">
        <thead>
        <tr>
            <td>描述</td>
            <td>值</td>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>日期类型：</td>
            <td><form:input path="birthday"/></td>
        </tr>
        <tr>
            <td>整数类型：</td>
            <td><form:input path="total"/></td>
        </tr>
        <tr>
            <td>百分数类型：</td>
            <td><form:input path="discount"/></td>
        </tr>
        <tr>
            <td>货币类型：</td>
            <td><form:input path="money"/></td>
        </tr>
        </tbody>
    </table>
</form:form>
</body>
</html>
