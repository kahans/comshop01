<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>로그인</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
  <style>
    /* Remove the navbar's default rounded borders and increase the bottom margin */ 
    .navbar {
      margin-bottom: 50px;
      border-radius: 0;
    }
    
    /* Remove the jumbotron's default bottom margin */ 
     .jumbotron {
      margin-bottom: 0;
    }
   
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
  </style>
</head>
<body>
<div class="jumbotron">
  <div class="container text-center">
    <h1>Online Store</h1>      
    <p>Mission, Vission & Values</p>
  </div>
</div>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="<%=request.getContextPath()%>/user/main.jsp">Home</a></li>
        <li><a href="#">Products</a></li>
        <li><a href="#">Deals</a></li>
        <li><a href="#">Stores</a></li>
        <li><a href="#">Contact</a></li>
<%

%>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="<%=request.getContextPath()%>/user/user_login.jsp"><span class="glyphicon glyphicon-user"></span>로그인</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span>장바구니</a></li>
      </ul>
    </div>
  </div>
</nav>
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