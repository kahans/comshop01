<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>회원목록</h1>
<table border="1">
	<c:forEach var="user" items="${UserList}">
		<tr>
			<td>${user.getUSERID()}</td>
			<td>${user.getUSERNAME()}</td>
			<td>${user.getUSERADDR()}</td>
			<td>${user.getUSERHP()}</td>
			<td>${user.getUSEREMAIL()}</td>
			<td>${user.getUSERPOINT()}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>