<%--
  Created by IntelliJ IDEA.
  User: npeck
  Date: 2/28/23
  Time: 2:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="taglib.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Search Results: </h2>
<table>
  <thead>Users</thead>
  <c:forEach var="user" items="${users}">
    <tr>
      <td>First Name: ${user.firstName}</td>
      <td>Last Name: ${user.lastName}</td>
      <td>User Name: ${user.userName}</td>
      <td>Email: ${user.email}</td>
      <td>Address: ${user.address}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
