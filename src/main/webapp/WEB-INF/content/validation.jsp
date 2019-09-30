<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 2019/9/30
  Time: 上午11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>输入校验测试</title>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <form:form cssClass="form" method="post" action="${pageContext.request.contextPath}/validationTest">
        <table>
            <tr>
                <td><form:input path="loginname"/></td>
                <td><form:errors path="loginname"/></td>
            </tr>
            <tr>
                <td><form:input path="password"/></td>
                <td><form:errors path="password"/></td>
            </tr>
        </table>
        <button type="submit" class="btn btn-primary">提交</button>
    </form:form>
</div>
</body>
</html>
