<%--
  Created by IntelliJ IDEA.
  User: 90604
  Date: 2020/7/5
  Time: 18:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<base href="<%=basePath%>">
  <head>
    <title>$Title$</title>
  </head>
  <body>
  $END$
  </body>
</html>
