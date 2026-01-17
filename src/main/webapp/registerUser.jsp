<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register-Page</title>
</head>
<body>
	<h2 style = "blue">Welcome to User Details Page</h2>
	
	<form action="/save-user" method="POST">
	Enter id : <input type="text" id="id" name ="id">
	<br><br>
	Enter UserName : <input type="text" id="username" name ="username">
	<br><br>
	Enter Password : <input type="password" id="password" name ="password">
	<br><br>
	Enter Email : <input type="text" id="email" name ="email">
	<br><br>
	Enter Role : <input type="text" id="role" name ="role">
	<br><br>
	Enter Mobile: <input type="text" id="mobile" name ="mobile">
	<br><br>
	<input type = "submit" value="Save">
	</form>
</body>
</html>