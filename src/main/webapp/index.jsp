<%@include file="taglib.jsp"%>
<html>
<body>
<%@include file="head.jsp"%>
<h2>Compost Collectors</h2>
<%@include file="navbar.jsp"%>
<c:choose>
    <c:when test="${empty userName}">
        <a href = "logIn">Log in</a>
    </c:when>
    <c:otherwise>
        <h3>Welcome ${userName}</h3>
    </c:otherwise>
</c:choose>
<%@include file="boostrap.jsp"%>
</body>
<%@include file="footer.jsp"%>
</html>
