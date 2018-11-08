<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nkotliar
  Date: 23/10/2018
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>404 Error Page</title>
</head>
<body>

<div class="http-error-container">
    <h1>HTTP Status 404 - Page Not Found</h1>
    <p class="message-text">The page you requested is not available. You might try returning to the <a href="<c:url value="/chat/user/list"/>">home page</a>.</p>
</div>

</body>
</html>
