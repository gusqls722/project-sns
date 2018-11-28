<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="common/session.jspf" %>
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
              <button type="button" class="btn btn-default">회원정보</button>
             <button type="button" class="btn btn-default" onclick="logout()">로그아웃</button>
            <button type="button" class="btn btn-default">생각중인버튼</button>
            
          </form>
        </div><!--/.navbar-collapse -->
      </div>
    </nav>

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
      	<h3>모든 클럽명</h3>
      <table class="table" style="margin-top:15px">
      <thead>
		      <tr>
			        <th>클럽명</th>
			        <th>클럽 설명</th>
			        <th>회원수</th>
		      </tr>
      </thead>
      <tbody id="ciBody">
      	
      </tbody>
      </table>  
    
      </div>
    </div>

    <div class="container">

      <hr>

      <footer>
        <p class="text-center">&copy; bdi club</p>
      </footer>
    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="${resPath}/js/bootstrap.min.js"></script>
  </body>
  
<script>
  window.addEventListener('load',function(){
	var xhr = new XMLHttpRequest();
	xhr.open('GET','/cis');
	xhr.onreadystatechange = function(){
		if(xhr.readyState==4){
			if(xhr.status==200){
				var res = JSON.parse(xhr.responseText);
				var html = '';
				for(var ci of res){
					html += '<tr>';
					html += '<td>'+ci.clubname+'</td>';
					html += '<td>'+ci.clubdesc+'</td>';
					html += '<td>'+ci.clubUC+'</td>';
					html += '<td><a href="/cis/'+ci.clubno+'">more</td>';
					html += '</tr>';
				}
				
				document.querySelector('#ciBody').insertAdjacentHTML('beforeend',html);
			}else{
				
			}
		}
	}
	xhr.send();
})

	function logout(){
	  location = '/uis/logout';
	  alert('로그아웃 되셨습니다.');
  	}
</script>