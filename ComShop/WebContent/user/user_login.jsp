<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>로그인</title>
</head>
<body>
<form name="loginform" action="./UserLoginAction.us" method="post">
	<center>
		<table border=1>
			<tr>
				<td colspan="2" align="center">
					<b><font size=5>로그인</font></b>
				</td>
			</tr>
			<tr>
				<td align="right">아이디 :</td>
				<td><input type="text" name="User_ID" /></td>
			</tr>
			<tr>
				<td align="right">비밀번호 :</td>
				<td><input type="password" name="User_PW" /></td>
			</tr>
			<tr>
				<td colspan="2" align="left">
					<input type="radio" name="User_LEVEL" value="구매자" checked/>사용자
					<input type="radio" name="User_LEVEL" value="관리자"/>관리자
				</td>
			</tr>
			<tr>
				<td colspan="2" align=center>
					<a href="javascript:loginform.submit()">로그인</a>&nbsp;&nbsp;
					<a href="UserJoin.us">회원가입</a>
				</td>
			</tr>
		</table>
	</center>
</form>
</body>
</html>