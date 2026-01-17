<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page import="java.util.*,com.tka.model.Users"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Details</title>
</head>
<body>
	<h3>User-Details</h3>
	<table border="1">
		<tr>
			<td>Id</td>
			<td>UserName</td>
			<td>Password</td>
			<td>Email</td>
			<td>Role</td>
			<td>Contact</td>
		</tr>
		<c:forEach var="user" items="${userList}">
			<tr>
				<td>${user.id}</td>
				<td>${user.username}</td>
				<td>${user.password}</td>
				<td>${user.email}</td>
				<td>${user.role}</td>
				<td>${user.mobile}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>