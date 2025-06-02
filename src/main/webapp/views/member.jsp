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
<form action="${pageContext.request.contextPath}/servlet/user-add" method="post">
<p>
	パスワード：<br><input type="text" name="password">
	</p><br>
	<p>
	姓：<br><input type="text" name="last_name">
	</p><br>
	<p>
	名:<br><input type="text" name="first_name">
	</p><br>
	住所：<br><input type="text" name="address">
	</p><br>
	メールアドレス：<br><input type="text" name="mail_address">
	</p><br>
	<input type="submit" value="登録">
	<input type="submit" value="リセット">
	
	</form>
	
	

</body>
</html>