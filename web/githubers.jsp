<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 29/05/18
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="bootstrap/header.jsp" />
</head>
<body>
    <ul>
        <c:forEach items= "${requestScope.maListe}" var = "currentValue">
            <li>
                Name : ${currentValue.name} , mail : ${currentValue.email}, github : ${currentValue.avatarUrl}
            </li>


        </c:forEach>
    </ul>
</body>
</html>
