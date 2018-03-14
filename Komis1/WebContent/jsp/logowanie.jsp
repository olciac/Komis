<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Logowanie</title>
</head>
<body>
<h1>Zaloguj się:</h1>
<hr>
	<form action="" method="post">
		<label>Login:</label><input type="text" name="login" /><br>
		<label>Hasło:</label><input type="text" name="haslo" /><br>
		<input type="submit" value="ZALOGUJ"><br>
		<span class="error">${error}</span>
	</form>

<a href="/Komis1/Komis" title="">Test</a>

</body>
</html>