<%@page import="com.sns.sp.vo.ClubInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="common/session.jspf"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>여러가지 취미 CLUB</title>

<!-- Bootstrap core CSS -->
<link href="${resPath}/css/bootstrap.min.css" rel="stylesheet">
<style>
table {
	width: 75%;
}
</style>
<body>

	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<form class="form-inline">
					<a class="navbar-brand" href="/uri/main/main"><img
						src="${resPath}/image/logo.png" style="width: 80px; height: 30px;"></a>
					<div class="form-group"
						style="padding-top: 14px; margin-bottom: -5px;">
						<input type="text" class="form-control" id="search"
							placeholder="검색할 클럽">
						<button type="button" class="btn btn-default">검색</button>
					</div>
				</form>
			</div>
			<div id="navbar" class="navbar-collapse collapse"
				style="margin-top: 4px;">
				<form class="navbar-form navbar-right">
					<span style="color: white; margin-top: 3px;">${user.username}
						님 환영합니다.</span>
					<button type="button" class="btn btn-default" onclick="userInfo()">회원정보</button>
					<button type="button" class="btn btn-default" onclick="logout()">로그아웃</button>
					<button type="button" class="btn btn-default">생각중인버튼</button>

				</form>
			</div>
			<!--/.navbar-collapse -->
		</div>
	</nav>

	<!-- Main jumbotron for a primary marketing message or call to action -->
	<div class="jumbotron">
		<div class="container">
			<h3>클럽 만들기</h3>
			<table class="table">
				<thead>
					<tr>
						<th>클럽 명</th>
					</tr>
					<tr>
						<th><input type="text" id="clubname" class="form-control"
							placeholder="클럽명을 입력해 주세요"></th>
					</tr>
					<tr>
						<th>클럽 설명</th>
					</tr>
					<tr>
						<th><textarea id="clubdesc" class="form-control"
								placeholder="클럽설명을 입력해 주세요" rows="4"></textarea></th>
					</tr>
				</thead>
				<tbody id="ciBody">

				</tbody>
			</table>
			<a class="btn btn-primary btn-lg" role="button" onclick="cc()">클럽
				생성 &raquo;</a> <a class="btn btn-primary btn-lg" href="/uri/main/main"
				role="button">생성 취소 &raquo;</a>
		</div>
	</div>

	<div class="container">
		<!-- Example row of columns -->
		<div class="row">
			<div class="col-md-4">
				<h2>가입된 동아리</h2>
				<p>동아리정보</p>
				<p>
					<a class="btn btn-default" href="#" role="button">자세히 보기
						&raquo;</a>
				</p>
			</div>
			<div class="col-md-4">
				<h2>가입된 동아리</h2>
				<p>동아리정보</p>
				<p>
					<a class="btn btn-default" href="#" role="button">자세히 보기
						&raquo;</a>
				</p>
			</div>
			<div class="col-md-4">
				<h2>가입된 동아리</h2>
				<p>동아리정보</p>
				<p>
					<a class="btn btn-default" href="#" role="button">자세히 보기
						&raquo;</a>
				</p>
			</div>
		</div>

		<hr>

		<footer>
			<p class="text-center">&copy; bdi club</p>
		</footer>
	</div>
	<!-- /container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="${resPath}/js/bootstrap.min.js"></script>
</body>
<script>

	function cc(){
		var cn = document.querySelector('#clubname').value;
		var cd = document.querySelector('#clubdesc').value;
		
		var conf = {
				url:'/clubinfos/create',
				method:'POST',
				param : JSON.stringify({clubname:cn,clubdesc:cd}),
				success : function(res){
					res = JSON.parse(res);
					alert(res.msg);
					location = '/uri/main/main';
					}
				}
			au.send(conf);
	}
</script>
</html>