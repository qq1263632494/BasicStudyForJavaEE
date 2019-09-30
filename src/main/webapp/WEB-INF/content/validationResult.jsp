<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 2019/9/30
  Time: 上午11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="tester">
    <table>
        <tr>
            <td>登录名：</td>
            <td><form:input path="loginname"/></td>
            <td><form:errors path="loginname"/> </td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><form:input path="password"/></td>
            <td><form:errors path="password"/> </td>
        </tr>
    </table>
</form:form>
</body>
</html>
