<%@include file="taglib.jsp"%>
<html>
<body>
<h2>Compost Collectors</h2>
<a href="/compostcollectors_war/createAccount.jsp">Create A new Account</a>
<a href="/viewAccount.jsp">View your account</a>
<a href="/compostcollectors_war/editAccount.jsp">Edit your account</a>
<a href="/compostcollectors_war/deleteAccount.jsp">Delete your account</a>
<c:choose>
    <c:when test="${empty userName}">
        <a href = "logIn">Log in</a>
    </c:when>
    <c:otherwise>
        <h3>Welcome ${userName}</h3>
    </c:otherwise>
</c:choose>

</body>
</html>
