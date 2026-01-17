
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN-PAGE</title>
</head>
<body>

<c:if test="${not empty msg}">
    <script>
        alert("${msg}");
    </script>
</c:if>

	<h2 style = "blue">USER-LOGIN</h2>
	<form action="/verify-login" method="POST">
	Enter UserName : <input type="text" id="username" name ="username">
	<br><br>
	Enter Password : <input type="password" id="password" name ="password">
	<br><br>
	<input type = "submit" value="Log-In">
	</form>
	
	<br>
	<br><br>
	
	<a href="index.jsp">Index Page</a>
	
</body>
</html>