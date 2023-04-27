<%@include file="taglib.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: npeck
  Date: 2/28/23
  Time: 2:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<c:import url="head.jsp"/>
<body>
<h2 class="text-center">Search Results: </h2>
<table class="table table-striped">
  <thead>Account</thead>
  <c:forEach var="user" items="${users}">
    <tr>
      <td>First Name: ${user.firstName}</td>
      <td>Last Name: ${user.lastName}</td>
      <td>User Name: ${user.userName}</td>
      <td>Email: ${user.email}</td>
      <td>Address: ${user.address}</td>
      <td><a href="/compostcollectors_war/updateAccount.jsp">Edit</a></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
