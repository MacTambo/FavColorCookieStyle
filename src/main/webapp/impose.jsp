<%--
  Created by IntelliJ IDEA.
  User: Arthur
  Date: 11/02/2022
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="impose.css">
    <title>Impose ton style !</title>
</head>
<body style="background: ${background}" >
<center>
<h1>Impose ton style !</h1>

<form action="impose-servlet" method="post">
Couleur 1
<select name="couleur1">
    <option value="black">black</option>
    <option value="blue">blue</option>
    <option value="red">red</option>
    <option value="green">green</option>
    <option value="purple">purple</option>
    <option value="white">white</option>
    <option value="yellow">yellow</option>
</select>
Couleur 2
<select name="couleur2">
    <option value="white">white</option>
    <option value="yellow">yellow</option>
    <option value="black">black</option>
    <option value="blue">blue</option>
    <option value="red">red</option>
    <option value="green">green</option>
    <option value="purple">purple</option>
</select>
    <input style="background: ${waves}" type="submit" value="Let's go !">
</form>
</center>
</body>
</html>
