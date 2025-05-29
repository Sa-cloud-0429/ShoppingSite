<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@ page errorPage="login-error.jsp"%>
<%@ page import="beans.Beans"%>

<%
Beans u = (Beans) request.getAttribute("user");
%>

<%=u.getlast_name()%><br>
<%=u.getfirst_name()%><br>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="user-menu.jsp" method="post">
		<%
		if (u != null) {
		%>

		ようこそ、<%=u.getlast_name()%>
		<%=u.getfirst_name()%>さん！<br>
		<%}%>
		<input type="submit" value="修正"><br> <input type="submit"
			value="削除"><br> <input type="submit" value="ログアウト"><br>
	</form>

</body>
</html>