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
<body>
<center>
<h1>Impose ton style !</h1>

<form action="impose-servlet" method="post">
Couleur 1
<select name="couleur1">
    <option value="noir">noir</option>
    <option value="bleu">bleu</option>
</select>
Couleur 2
<select name="couleur2">
    <option value="blanc">blanc</option>
    <option value="bleu">jaune</option>
</select>
    <input type="submit" value="Let's go !">
</form>
</center>
</body>
</html>
