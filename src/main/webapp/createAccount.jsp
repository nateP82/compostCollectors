<%--
  Created by IntelliJ IDEA.
  User: npeck
  Date: 2/28/23
  Time: 12:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Compost Collectors</h2>
<h3>
    Create User Account
</h3>
<form action="createUser">
    <label for="firstName">First Name:</label>
    <input id="firstName"  name="firstName" type="text">
    <label for="lastName">Last Name:</label>
    <input id="lastName"  name="lastName" type="text">
    <label for="userName">Username:</label>
    <input id="userName"  name="userName" type="text">
    <label for="email">Email:</label>
    <input id="email"  name="email" type="text">
    <label for="password">Password:</label>
    <input id="password"  name="password" type="text">
    <label for="address">Address:</label>
    <input id="address"  name="address" type="text">
    <div>
        <button type="submit" name="submit" value="Create Account">Create Account</button>
    </div>
</form>

</body>
</html>
