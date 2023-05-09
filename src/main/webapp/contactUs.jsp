<%@include file="taglib.jsp"%><%--
  Created by IntelliJ IDEA.
  User: npeck
  Date: 4/22/23
  Time: 1:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<c:import url="head.jsp"/>
<body>
<c:import url="navbar.jsp"/>
<h1 class="text-center">Contact Us</h1>
<form>
    <div class="form-group col-4">
        <label class="col-sm-4" for="firstName">First Name:</label>
        <input class="form-control" id="firstName"  name="firstName" type="text">
    </div>
    <div class="form-group col-4">
        <label for="lastName">Last Name:</label>
        <input class="form-control" id="lastName"  name="lastName" type="text">
    </div>
    <div class="form-group col-4">
        <label for="username">Email:</label>
        <input class="form-control" id="username"  name="username" type="text">
    </div>
    <div class="form-floating">
        <textarea class="form-control" id="message" placeholder="Leave us a message" name="message" type="textarea"></textarea>
        <label for="message">Message:</label>
    </div>
    <div class="mb-3">
        <button class="btn btn-primary my-3" type="submit" name="submit" value="Create Account">Send</button>
    </div>
</form>
</body>
</html>
