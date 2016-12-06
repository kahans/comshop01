<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="./UserJoinAction.us" method="post" name="joinform">
		<center>
			<table border=1>
			<tr>
				<td colspan="2" align="center">
					<b><font size=4>회원가입</font></b>
				</td>
			</tr>
			<tr>
				<td align="right">아이디 :</td>
				<td><input type="text" name="User_ID"/></td>
			</tr>
			<tr>
				<td align="right">비밀번호 :</td>
				<td><input type="password" name="User_PW"/></td>
			</tr>
			<tr>
				<td align="right">이름 :</td>
				<td><input type="text" name="User_NAME"/></td>
			</tr>
			<tr>
				<td align="right">주소 : </td>
				<td ><input type="text" name="User_ADDR"/></td>
			</tr>
			<tr>
				<td align="right">전화번호 :</td>
				<td><input type="text" name="User_HP"/></td>
			</tr>
			<tr>
				<td align="right">Email :</td>
				<td ><input type="text" name="User_EMAIL"/></td>
			</tr>
			
			</table>
		<input type="hidden" name="User_LEVEL" value="구매자"/>
		<input type="hidden" name="User_POINT" value="0"/>
		<input type="submit" value="입력완료" />
		</center>
	
	</form>

</body>
</html>