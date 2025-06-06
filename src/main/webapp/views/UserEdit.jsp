<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>会員情報編集画面</h1>
	<form action="user-edit-confirm" method="post">

		<p>
			姓：<br> <input type="text" name="last_name" required>
		</p>
		<br>
		<p>
			名:<br> <input type="text" name="first_name" required>
		</p>
		<br> 住所：<br> <input type="text" name="address" required>
		</p>
		<br> メールアドレス：<br> <input type="text" name="mail_address" required>
		</p>
		

		<br> <input type="submit" value="確認">
	</form>
	<a href="<%=request.getContextPath() %>//views/user-menu.jsp" >会員メニューへ戻る</a>
	
</body>
</html>