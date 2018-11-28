<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>회원정보</title>

<!-- Bootstrap core CSS -->
<link href="${resPath}/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>

	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<h4>회원정보</h4>
			</div>
			
		</div>
		
	</nav>
	
	<div class="jumbotron">
		<div class="container">
		<table class="table">
 			<tr>
 				<th>아이디</th>
 				<td>test</td>
 			</tr>
 			<tr>
 				<th>이름</th>
 				<td>홍길동</td>
 			</tr>
 			<tr>
 				<th>이메일</th>
 				<td>test@naver.com</td>
 			</tr>
 			<tr>
 				<th>생년월일</th>
 				<td>1993.10.20</td>
 			</tr>
 			<tr>
 				<th>성별</th>
 				<td>남성</td>
 			</tr>
		</table>
		<button type="button" class="btn btn-default">회원수정</button>
            <button type="button" class="btn btn-default">돌아가기</button>
	</div>
</body>
</html>