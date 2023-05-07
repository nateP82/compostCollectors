<%@include file="taglib.jsp"%><%--
  Created by IntelliJ IDEA.
  User: npeck
  Date: 5/7/23
  Time: 12:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<c:import url="head.jsp"/>
<body>
<c:import url="navbar.jsp"/>
<h2 class="text-center">Compost User Report</h2>
<c:set var="serviceData" scope="session" value="${serviceDetail}"/>
<c:set var="materialData" scope="session" value="${materialDetail}"/>
<c:set var="periodData" scope="session" value="${periodDetail}"/>
<c:set var="priceData" scope="session" value="${priceDetail}"/>
<p><c:out value="${serviceDetail}"/></p>
<p><c:out value="${materialDetail}"/></p>
<p><c:out value="${periodDetail}"/></p>
<p><c:out value="${priceDetail}"/></p>
</body>
<c:import url="footer.jsp"/>
</html>
