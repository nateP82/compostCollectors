<%@include file="taglib.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: npeck
  Date: 3/1/23
  Time: 9:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<c:import url="head.jsp"/>
<body>
<h2 class="text-center">Update your user account</h2>
<a href="index.jsp">Home</a>
<div class="container-fluid">
    <form action="updateAccount" class="form-group" method="POST">
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
            <button class="btn btn-primary my-3" type="submit" name="submit" value="Update Account">Update</button>
        </div>
    </form>
</div>
</body>
</html>
