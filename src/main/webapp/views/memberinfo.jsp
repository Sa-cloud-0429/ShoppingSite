<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="beans.Beans"%>

<%
Beans member = (Beans) session.getAttribute("user");
%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="memberinfo.jsp" method="post">
		<%
		if (member != null) {
		%>

		<h1>会員情報</h1>
		<p>
			姓:<br><%=member.getLastName()%>
		</p>
		<p>
			名:<br><%=member.getFirstName()%>
		</p>
		<p>
			住所:<br><%=member.getAddress()%>
		</p>
		<p>
			メールアドレス:<br><%=member.getMailAddress()%>
		</p>
		<%
		} else {
		%>
		<p>ログイン情報が見つかりません</p>
		<%
		}
		%>
		 <a href="user-menu.jsp">HOME</a>

	</form>



</body>
</html>