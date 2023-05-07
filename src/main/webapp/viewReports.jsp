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
<h2 class="text-center">View Reports</h2>
<c:import url="navbar.jsp"/>
<form action="#" method="GET">
    <table>
        <tbody>
        <tr>
            <td>
    <label>View your Materials report</label>
    <button class="btn btn-primary mb-3" type="submit">View Report</button>
            </td>
        </tr>
        <tr>
            <td>
    <label>View your Time report</label>
    <button class="btn btn-primary mb-3" type="submit">View Report</button>
            </td>
        </tr>
        <tr>
            <td>
    <label>View your Price report</label>
    <button class="btn btn-primary mb-3" type="submit">View Report</button>
            </td>
        </tr>
        <tr>
            <td>
    <label>View your Service report</label>
    <button class="btn btn-primary mb-3" type="submit">View Report</button>
            </td>
        </tr>
        </tbody>
    </table>
</form>

</body>
<c:import url="footer.jsp"/>
</html>
