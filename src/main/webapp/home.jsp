

<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HOME-PAGE</title>
</head>
<body>


	<c:if test="${not empty msg}">
		<script>
			alert("${msg}");
		</script>
	</c:if>
	<h2 style="">Welcome to Home Page</h2>

	HOME PAGE
</body>
</html>