<%@include file="taglib.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: npeck
  Date: 2/28/23
  Time: 1:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<c:import url="head.jsp"/>
<body class="bg-body-secondary">
<c:import url="navbar.jsp"/>
<h2 class="text-center">Account Details</h2>
<form method="GET" action="viewAccount">
    <div class="form-group col-4">
    <label class="col-sm-4" for="searchLastName" name="searchLastName">Search Users by Last Name</label>
    <input class="form-control" type="text" id="searchLastName" name="searchLastName">
    </div>
    <div class="mb-3">
    <button class="btn btn-primary my-3" type="submit" name="submit" value="searchAccount">View Account</button>
    <button class="btn btn-primary my-3" type="submit" name="submit" value="searchAll">View All</button>
    </div>
</form>
</body>
</html>
