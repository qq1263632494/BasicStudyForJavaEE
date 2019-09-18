<%@ page import="controller.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Random" %><%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 2019/9/17
  Time: 下午3:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>简单测试</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <table class="table table-stripped">
        <thead>
        <tr class="active">
            <td>name</td>
            <td>pass</td>
        </tr>
        </thead>
        <tbody>
        <%List<User> list = (List<User>)request.getAttribute("data");%>
        <%List<String> colors = new ArrayList<>(); colors.add("success"); colors.add("info"); colors.add("danger"); colors.add("warning");%>
        <%for (User user:list){%>
        <tr class="<%=colors.get(new Random().nextInt(colors.size()))%>">
            <td><%=user.getName()%></td>
            <td><%=user.getPass()%></td>
        </tr>
        <%}%>
        </tbody>
    </table>
</div>
</body>
</html>
