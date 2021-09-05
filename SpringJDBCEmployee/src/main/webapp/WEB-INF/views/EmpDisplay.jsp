<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page isELIgnored = "false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Display</title>
<style>
body{
text-align:center;
background-color: powderblue;
}
</style>
</head>

<body>
<h1> ${ename} the Employee details are: </h1>
${empBean}


<form action="./wel" method="get">
<input type="submit" value="Back">
</form>
</body>
</html>