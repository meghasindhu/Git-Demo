<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style>
body{
text-align:center;
background-color: powderblue;
}
</style>
</head>
<body>
<fieldset>
<legend>Employee Login Form</legend>
<form action="./wel" method="post">
<label>Employee ID</label>
<input type="number" name="empId" placeholder="Enter the employee id"><br>
<label>Employee Password</label>
<input type="password" name="password" placeholder="Enter the password"><br>
<input type="submit" value="Login">
</form>
</fieldset>
</body>
</html>