<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete employee</title>
<style>
body{
text-align:center;
background-color: powderblue;
}
</style>
</head>
<% String msg=(String)request.getAttribute("msg");%>
<body>
<h1> ${ename}</h1> <%=msg %>

<form action="./wel" method="get">
<input type="submit" value="Back">
</form>

</body>
</html>