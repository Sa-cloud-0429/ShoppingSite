<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@ page errorPage="login-error.jsp"%>
<%----エラーが発生したらここに飛ばす --%>
<%@ page import="beans.Beans"%>
<%----ユーザー情報とかを持っている --%>

<%
Beans u = (Beans) session.getAttribute("user");
%>
<%----今のページを呼び出すのにrequest.getAttribute("user")でUSERという名前で情報を渡しているか探している、
（Beans)取ってきた情報はbeans型だよって教えている、
beans u=はその型をuという名前の変数に入れてる --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>HOME</h1>
	<form action="user-menu.jsp" method="post">
		<%
		if (u != null) {
		%>

		<%----uがnullじゃなければ --%>

		<h2>
			ようこそ、<%=u.getLastName()%><%=u.getFirstName()%>さん！
		</h2>
		<br>
		<%}%><%----beansのgetlast_nameとかを使って表示している --%>
		
		

	</form>
	<form action="<%=request.getContextPath() %>/servlet/userdelete" method="post" onsubmit="return confirm('削除してもよろしいですか？');">
	<input type="submit" value="削除"><br>
	</form>

	<form action="UserEdit.jsp" method="post">
		<input type="submit" value="編集"><br>
	</form>

	<form action="logout-servlet" method="post">
		<input type="submit" value="ログアウト">
	</form>

	<form action="memberinfo.jsp" method="post">
		<input type="submit" value="会員情報"><br>
	</form>





</body>
</html>