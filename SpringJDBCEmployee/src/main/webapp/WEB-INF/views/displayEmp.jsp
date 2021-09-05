<%@page import="org.springframework.ui.ModelMap"%>
<%@page import="com.technoelevate.SpringJDBCUsingQueryMethod.EmployeeDTOLayer.EmployeeDTOBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
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
<h1> ${ename} is the the details of all employee</h1>


<c:forEach var="a" items="${employee}">
<c:out value="${a}"/><br> 
</c:forEach>

<form action="./wel" method="get">
<input type="submit" value="Back">
</form>
</body>
</html>