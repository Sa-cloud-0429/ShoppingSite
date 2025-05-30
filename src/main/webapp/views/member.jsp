<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>新規会員登録</h1>
<from action="member-servlet" method="post">
<p>
	パスワード：<br><input type="text" name="password">
	</p><br>
	<p>
	姓：<br><input type="text" name="lastname">
	</p><br>
	<p>
	名:<br><input type="text" name="firstname">
	</p><br>
	住所：<br><input type="text" name="address">
	</p><br>
	メールアドレス：<br><input type="text" name="mail">
	</p><br>
	<input type="submit" value="確定">
	</from>
	

</body>
</html>