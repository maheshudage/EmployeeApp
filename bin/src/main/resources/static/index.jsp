
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>INDEX-PAGE</title>
</head>
<body>


	<c:if test="${not empty msg}">
		<script>
			alert("${msg}");
		</script>
	</c:if>
	<h2 style="color: blue">Welcome</h2>

	<a href="/login.jsp">LOGIN</a> |
	<a href="/get-all-user-details">SEE USERS DATA</a> |
	<a href="/registerUser.jsp">NEW REGISTERATION</a>

</body>
</html>