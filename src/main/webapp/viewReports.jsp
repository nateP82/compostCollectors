<%@include file="taglib.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: npeck
  Date: 5/7/23
  Time: 9:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<c:import url="head.jsp"/>
<body>
<c:import url="navbar.jsp"/>
<h2 class="text-center">View Reports</h2>
<form action="reportingData" method="GET">
    <table>
        <tbody>
        <tr>
            <td>
    <label>View your Composting report</label>
    <button class="btn btn-primary mb-3" type="submit">View Report</button>
            </td>
        </tr>
        <tr>
            <td>
        </tbody>
    </table>
</form>

</body>
<c:import url="footer.jsp"/>
</html>
