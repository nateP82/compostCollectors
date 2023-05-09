<%@include file="taglib.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: npeck
  Date: 2/28/23
  Time: 12:18 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<c:import url="head.jsp"/>
<body class="bg-body-secondary">
<c:import url="navbar.jsp"/>
<h2 class="text-center">Compost Collectors</h2>
<h3>
    Create User Account
</h3>
<form method="POST" action="createAccount">
    <div class="form-group col-4">
    <label class="col-sm-4" for="firstName">First Name:</label>
    <input class="form-control" id="firstName"  name="firstName" type="text">
    </div>
    <div class="form-group col-4">
    <label for="lastName">Last Name:</label>
    <input class="form-control" id="lastName"  name="lastName" type="text">
    </div>
    <div class="form-group col-4">
    <label for="username">Username:</label>
    <input class="form-control" id="username"  name="username" type="text">
    </div>
    <div class="form-group col-4">
    <label for="email">Email:</label>
    <input class="form-control" id="email"  name="email" type="text">
    </div>
    <div class="form-group col-4">
    <label for="password">Password:</label>
    <input class="form-control" id="password"  name="password" type="text">
    </div>
    <div class="form-group col-4">
    <label for="address">Address:</label>
    <input class="form-control" id="address"  name="address" type="text">
    </div>
    <div class="mb-3">
        <button class="btn btn-primary my-3" type="submit" name="submit" value="Create Account">Create Account</button>
    </div>
</form>
</body>
</html>
