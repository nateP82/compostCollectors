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
<h2 class="text-center">Compost User Report</h2>
<c:set var="serviceData" scope="session" value="${serviceDetail}"/>
<p><c:out value="${serviceDetail}"/></p>
</body>
<c:import url="footer.jsp"/>
</html>
