<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Page</title>
<style>
body{
text-align:center;
background-color: powderblue;
}
</style>
</head>
<body>
<h1>Welcome Back ${ename}</h1>
<a href="./display">View All Employee</a><br>
<a href="./insert">Add an Employee</a><br>
<a href="./delete">Delete an Employee</a><br>
<a href="./emp">Display an Employee Details</a><br>
 <a href="./logout">Logout</a>

</body>
</html>