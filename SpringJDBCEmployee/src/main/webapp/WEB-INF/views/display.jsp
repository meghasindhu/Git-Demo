<%@page import="com.technoelevate.SpringJDBCUsingQueryMethod.EmployeeDTOLayer.EmployeeDTOBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee data</title>
<style>
body{
text-align: center;
background-color: powderblue;
}
</style>
</head>
<%EmployeeDTOBean emp = (EmployeeDTOBean)request.getAttribute("mybean");
String msg = (String)request.getAttribute("msg");%>
<body>
 ${ename} details <%=msg %><br>
<h1>Below are the Employee details inserted into database</h1>

employee id= <%=emp.getEmpId() %><br>
employee name= <%=emp.getEname() %><br>
employee password= <%=emp.getPassword() %>

 <form action="./wel" method="get">
<input type="submit" value="Back">
</form>
</body>
</html>