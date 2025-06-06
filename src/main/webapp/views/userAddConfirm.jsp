<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--<%-->
<!--  Beans user = (Beans) request.getAttribute("user");-->
<!--%>	-->
	 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>登録する内容はよろしいですか？</h1>


		パスワード：<br> <input type="text" name="password" value="${user.password}">
	
	<br>
	
		姓：<br> <input type="text" name="last_name" value="${user.lastName}">
	
	<br>

		名:<br> <input type="text" name="first_name" value="${user.firstName}">
		
	<br> 住所：
	<br>
	<input type="text" name="address" value="${user.address}">
	
	<br> メールアドレス：
	<br>
	<input type="text" name="mail_address" value="${user.mailAddress}">
	
	<form action="userSuccess.jsp" method="post">
	<input type="submit" value="確定">
	</form>

</body>
</html>