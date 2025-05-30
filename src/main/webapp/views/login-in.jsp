<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>LOGIN</h1>

	<form action="login-servlet" method="post">
		<%---login-servletにデータ送信-----%>
		<p>
			ID:<br> <input type="text" name="ID">
		</p>
		<br>
		<p>
			PASSWORD:<br> <input type="password" name="password">
		</p>
		<br> <input type="submit" value="ログイン"><br>
	</form>
	<form action="member-servlet" method="post">
		<input type="submit" value="新規会員登録"><br>

	</form>

</body>
</html>