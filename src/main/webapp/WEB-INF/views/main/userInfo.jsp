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
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <form class="form-inline">
          <a class="navbar-brand" href="/uri/main/main"><img src="${resPath}/image/logo.png" style="width:80px; height:30px; "></a>
          <div class="form-group" style="padding-top:14px; margin-bottom:-5px;">
           	<input type="text" class="form-control" id="search" placeholder="검색할 클럽">
           	<button type="button" class="btn btn-default">검색</button>
          </div>
          </form>
        </div>
        <div id="navbar" class="navbar-collapse collapse" style="margin-top:4px; ">
          <form class="navbar-form navbar-right"> 
          <span style="color:white; margin-top:3px;">${user.username} 님 환영합니다.</span>
              <button type="button" class="btn btn-default" onclick="userInfo()">회원정보</button>
             <button type="button" class="btn btn-default" onclick="logout()">로그아웃</button>
            <button type="button" class="btn btn-default">생각중인버튼</button>
            
          </form>
        </div><!--/.navbar-collapse -->
      </div>
    </nav>
	
	<div class="jumbotron">
		<div class="container">
		<h3>회원정보</h3>
		<table class="table" style="margin-top:15px">
 			<tr>
 				<th>아이디</th>
 				<td>${user.userid}</td>
 			</tr>
 			<tr>
 				<th>이름</th>
 				<td>${user.username}</td>
 			</tr>
 			<tr>
 				<th>이메일</th>
 				<td>${user.useremail}</td>
 			</tr>
 			<tr>
 				<th>생년월일</th>
 				<td>${user.userbirth}</td>
 			</tr>
 			<tr>
 				<th>성별</th>
 				<td>${user.usergender}</td>
 			</tr>
		</table>
		
	</div>
	</div>
	<div class="container">
      <!-- Example row of columns -->
      <div class="row">
        <button type="button" class="btn btn-default">회원수정</button>
        <button type="button" class="btn btn-default" onclick="goHome()">돌아가기</button>
      </div>

      <hr>
      
      <footer>
        <p class="text-center">&copy; bdi club</p>
      </footer>
</body>

<script>
	function goHome(){
		location.href="/uri/main/main";
	}
	
	function logout(){
		  location = '/uis/logout';
		  alert('로그아웃 되셨습니다.');
	}
	
	function userInfo(){
		location = '/uri/main/userInfo'
	}
</script>
</html>