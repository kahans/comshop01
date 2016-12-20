<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	session.invalidate();//세션 종료 로그아웃
%>
	<script language="javascript">
		alert("로그아웃");
		location.href ="<%=request.getContextPath()%>/user/main.jsp";
	</script>
</body>
</html>