<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete the record</title>
<style>
body{
text-align:center;
background-color: powderblue;
}
</style>
</head>
<body>
<form action="./delete" method="post">
<h1>Enter the employee id to be deleted</h1>
<input type="number" name="empId" placeholder="Enter the id">
<input type="submit" value="delete">
</form>

</body>
</html>