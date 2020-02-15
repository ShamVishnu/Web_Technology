<%-- 
    Document   : ExpressionLanguage
    Created on : 14 Feb, 2020, 11:03:17 AM
    Author     : shamv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to Expression Language</h1>
        <c:set var="SomeValue" value="${param.box}"></c:set>
        <c:if test="${(SomeValue>=1) && (SomeValue<=5)}">
            <p>The Value is Correct</p>
        </c:if>
    </body>
</html>
