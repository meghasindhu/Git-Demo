<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Login Page</title>
<style>
body{
text-align:center;
background-color: powderblue;
}
</style>
</head>
<body >
<h1> ${ename} please enter the details of employee to be inserted!!</h1>
<fieldset>
<legend>Employee Login Form</legend>
<form action="./insert" method="post" >
<label>Employee ID</label>
<input type="number" name="empId" placeholder="Enter the employee id"><br>
<label>Employee Name</label>
<input type="text" name="ename" placeholder="Enter the employee name"><br>
<label>Employee Password</label>
<input type="password" name="password" placeholder="Enter the password"><br>
<input type="submit" value="Login">

</form>
</fieldset>
</body>
</html>