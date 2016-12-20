<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>전체회원리스트</title>
<script language=javascript>
function showLayer(layerID) {
document.all[layerID].style.visibility = "visible";
}
function hideLayer(layerID) {
document.all[layerID].style.visibility = "hidden";
}
</script>
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
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
		</div>
		<!-- 카테고리 마우스오버를 사용하게 만들자. -->
		<div id="menu1"
			style="position: absolute; left: 10; top: 50px; z-index: 1; visibility: hidden">
			<table border="1" rules="none"
				onmouseout="javascript:hideLayer('menu1');"
				onmouseover="javascript:showLayer('menu1');">
				<tr>
					<th bgcolor="white">마우스</th>
				</tr>
				<tr>
					<td bgcolor=white><a href="http://cdmanii.tistory.com"
						target="new">내블로그 가기<br></a> <a
						href="http://cdmanii.tistory.com" target="new">내블로그 가기<br></a>
					</td>
				</tr>
			</table>
		</div>
		<div></div>
		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav">
				<li><a href="#" onmouseout="javascript:hideLayer('menu1');"
					onmouseover="javascript:showLayer('menu1');">카테고리</a></li>
				<li class="active"><a
					href="<%=request.getContextPath()%>/user/main.jsp">Home</a></li>
				<li><a href="#">Products</a></li>
				<li><a href="#">Deals</a></li>
				<li><a href="#">Stores</a></li>
				<li><a href="#">Contact</a></li>

			</ul>
			<ul class="nav navbar-nav navbar-right">
				<%
					String SNAME = (String) session.getAttribute("id");
					String SLEVEL = (String) session.getAttribute("level");
					if (SLEVEL == null) {
				%>
				<li><a href="<%=request.getContextPath()%>/user/UserLogin.us"><span
						class="glyphicon glyphicon-user"></span>로그인</a></li>
				<%
					} else {
				%>
				<%
					if (SLEVEL.equals("관리자")) {
				%>
				<li><a
					href="<%=request.getContextPath()%>/user/UserListAction.us">전체회원목록</a></li>
				<li><a href="#"><span class="glyphicon glyphicon-user"></span><%=SNAME%>&nbsp;님</a></li>
				<!-- 클릭시 회원정보 수정 할수 있도록 경로를 잡자 -->
				<li><a
					href="<%=request.getContextPath()%>/user/user_logout.jsp">로그아웃</a></li>
				<%
					} else {
				%>
				<li><a href="#"><span class="glyphicon glyphicon-user"></span><%=SNAME%>&nbsp;님</a></li>
				<!-- 클릭시 회원정보 수정 할수 있도록 경로를 잡자 -->
				<li><a
					href="<%=request.getContextPath()%>/user/user_logout.jsp">로그아웃</a></li>
				<%
					}

					}
				%>
				<li><a href="#"><span
						class="glyphicon glyphicon-shopping-cart"></span>장바구니</a></li>
			</ul>
		</div>
	</div>
	</nav>
	<div>
		<h2 align="center">회원목록</h2>
		<table border="1" align="center">
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>주소</th>
				<th>전화번호</th>
				<th>이메일</th>
				<th>포인트</th>
			</tr>
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
	</div>
	<br>
	<br>
	<footer class="container-fluid text-center">
	<p>Online Store Copyright</p>
	<form class="form-inline">
		Get deals: <input type="email" class="form-control" size="50"
			placeholder="Email Address">
		<button type="button" class="btn btn-danger">Sign Up</button>
	</form>
	</footer>


</body>
</html>