<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 2019/9/17
  Time: 上午10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <title>查询用户</title>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <form class="form" method="get" action="${pageContext.request.contextPath}/lookup">
            <div class="form-group">
                <label class="input-label" for="id"><spring:message code="hint"/></label>
                <input type="text" class="form-control" id="id" name="name"/>
            </div>
            <button class="btn btn-primary"><spring:message code="startQuery"/></button>
        </form>
    </div>
</body>