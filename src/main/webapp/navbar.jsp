<%@include file="taglib.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: npeck
  Date: 4/22/23
  Time: 12:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:import url="head.jsp" />
<nav class="navbar navbar-expand-lg navbar-light bg-white">
    <div class="container-fluid justify-content-end">
<%--        Create Account is now v2 work--%>
<%--    <a class="nav-link p-2" href="/compostcollectors_war/createAccount.jsp">Create A new Account</a>--%>
<%--    <a class="nav-link p-2" href="/compostcollectors_war/viewAccount.jsp">View your account</a>--%>
<%--    Update Account is now labeled as v2 work--%>
<%--    <a class="nav-link p-2" href="/compostcollectors_war/updateAccount.jsp">Update your account</a>--%>
    <a class="nav-link p-2" href="aboutUs.jsp">About Us</a>
    <a class="nav-link p-2" href="contactUs.jsp">Contact Us</a>
    <a class="nav-link p-2" href="materials.jsp">Accpeted Materials</a>
    <c:choose>
        <c:when test="${empty userName}">
            <a class="nav-link" href ="logIn">Log in</a>
        </c:when>
        <c:otherwise>
            <h3>Welcome ${userName}</h3>
            <a class="nav-link" href="logOut"><button class="btn btn-primary" type="submit">Log out</button></a>
            <a class="nav-link p-2" href="viewAccount.jsp"><button class="btn btn-primary" type="submit">View your account</button></a>
            <a class="nav-link p-2" href="viewReports.jsp"><button class="btn btn-primary" type="submit">View your Custom Compost Report</button></a>
        </c:otherwise>
    </c:choose>
    </div>
</nav>



