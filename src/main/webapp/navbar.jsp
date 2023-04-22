<%@include file="taglib.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: npeck
  Date: 4/22/23
  Time: 12:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-expand-lg navbar-light bg-white">
    <title>Compost Collectors</title>
    <a class="nav-link" href="/compostcollectors_war/createAccount.jsp">Create A new Account</a>
    <a class="nav-link" href="/compostcollectors_war/viewAccount.jsp">View your account</a>
    <a class="nav-link" href="/compostcollectors_war/editAccount.jsp">Edit your account</a>
    <a class="nav-link" href="/compostcollectors_war/deleteAccount.jsp">Delete your account</a>
    <c:choose>
        <c:when test="${empty userName}">
            <a class="nav-link" href = "logIn">Log in</a>
        </c:when>
        <c:otherwise>
            <h3>Welcome ${userName}</h3>
        </c:otherwise>
    </c:choose>
</nav>


