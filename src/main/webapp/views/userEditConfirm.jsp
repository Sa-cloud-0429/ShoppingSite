<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="beans.Beans"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>登録する内容はよろしいですか？</h2>
	<%
	Beans user = (Beans) request.getAttribute("updateUser");
	if (user != null) {
	%>
	<p>
		氏名:
		<%=user.getLastName()%>
		<%=user.getFirstName()%></p>
	<p>
		住所:
		<%=user.getAddress()%></p>
	<p>
		メールアドレス:
		<%=user.getMailAddress()%></p>
	<%
	} else {
	%>
	<p>ユーザー情報が見つかりません。</p>
	<%
	}
	%>


	<form action="userEditSuccess.jsp" method="post">
		<input type="submit" value="登録">
	</form>


</body>
</html>