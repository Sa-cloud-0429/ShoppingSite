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
	<form action="user-add" method="post">
		<p>
			メンバーID：<br> <input type="text" name="member_id" required>
		</p>
		<br>

		<p>
			パスワード：<br> <input type="text" name="password" required>
		</p>
		<br>
		<p>
			姓：<br> <input type="text" name="last_name" required>
		</p>
		<br>
		<p>
			名:<br> <input type="text" name="first_name" required>
		</p>
		<br> 住所：<br> <input type="text" name="address" required>
		</p>
		<br> メールアドレス：<br> <input type="text" name="mail_address"
			repired>
		</p>
		<br> <input type="submit" value="リセット">

		<input type="submit" value="確認"><br>
	
	</form>

	

	<a href="login-in.jsp">ログイン画面へ戻る</a>

	<!--	<form action="UserAddConfirm.java" method="post">-->

	<!--	</form>-->



</body>
</html>