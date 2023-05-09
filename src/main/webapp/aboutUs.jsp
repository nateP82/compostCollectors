<%@include file="taglib.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: npeck
  Date: 4/22/23
  Time: 1:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<c:import url="head.jsp"/>
<body class="bg-body-secondary">
<c:import url="navbar.jsp"/>
<h1 class="text-center">About Us</h1>
<section>
<p class="text-center">Compost Collectors was founded as a student project in 2023. The goals of the site are to:</p>
    <div class="d-flex justify-content-center">
        <ul>
            <li>Inform users about common composting practices</li>
            <li>Provide information about compostible vs. non-compostible materials</li>
            <li>Allow users to set up an account</li>
            <li>Request a composting bin to get started</li>
            <li>Scheduling services for compost pickup and removal</li>
        </ul>
    </div>
    <div class="d-flex justify-content-center">
    <img src="images/AboutUsComposters1.jpg" alt="compost_bin_and_materials"/>
    </div>
</section>
</body>
<c:import url="footer.jsp"/>
</html>
