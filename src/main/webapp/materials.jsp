<%@include file="taglib.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: npeck
  Date: 4/22/23
  Time: 1:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<c:import url="head.jsp"/>
<body class="bg-body-secondary">
<c:import url="navbar.jsp"/>
<h1 class="text-center">Materials</h1>
<div class="row">
    <div class="col-sm-6 mb-3 mb-sm-0">
        <div class="card">
            <h5 class="card-header">Compostible</h5>
            <div class="card-body">
                <ul>
                    <li>Food and Vegetable Scraps</li>
                    <li>Grass Clippings</li>
                    <li>Coffee Grounds</li>
                    <li>Paper Bags</li>
                    <li>Eggshells(Crushed)</li>
                    <li>Dry Leaves</li>
                    <li>Plant Stalks and Twigs</li>
                    <li>Shredded Paper</li>
                    <li>Shredded Cardboard</li>
                    <li>Untreated Wood Chips</li>
                </ul>
            </div>
        </div>
    </div>
    <div class="col-sm-6">
        <div class="card">
            <h5 class="card-header">Non-Compostible</h5>
            <div class="card-body">
                <ul>
                    <li>Fats, Oils, Greases</li>
                    <li>Cheese and Dairy Products</li>
                    <li>Pet Waste</li>
                    <li>Treated Wood</li>
                    <li>Glossy Paper</li>
                    <li>Meats, Bones</li>
                    <li>Herbicide Treated Plants</li>
                    <li>Dryer Lint</li>
                    <li>Diseased and Pest-Infested Plants</li>
                    <li>Fish</li>
                </ul>
            </div>
        </div>
    </div>
</div>
</body>
<c:import url="footer.jsp"/>
</html>
