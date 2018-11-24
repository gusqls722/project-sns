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

    <title>Jumbotron Template for Bootstrap</title>

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
          <a class="navbar-brand" href="#">로고</a>
          <input type="text">
          <button>검색</button>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <form class="navbar-form navbar-right">
            <div class="form-group">
            	<span style="color:white;">${user.username} 님 환영합니다.</span>
              <button onclick="goUI()">회원정보</button>
            </div>
            <div class="form-group">
             <button>로그아웃</button>
            </div>
            <button type="submit" class="btn btn-success">생각중인버튼</button>
          </form>
        </div><!--/.navbar-collapse -->
      </div>
    </nav>

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
      <table>
      	<td>
        <h1>동아리 정보 리스트</h1>
        <p>회원수 높은순으로 정렬</p>
        <p><a class="btn btn-primary btn-lg" href="#" role="button">더많은 동아리 보기 &raquo;</a></p>
        <p><a class="btn btn-primary btn-lg" href="#" role="button">동아리 만들기 &raquo;</a></p>
        </td>
        
        <td>
        <h1>동아리 정보 리스트2</h1>
        </td>
        <td>
        <h1>동아리 정보 리스트3</h1>
        </td>
       </table>
      </div>
    </div>

    <div class="container">
      <!-- Example row of columns -->
      <div class="row">
        <div class="col-md-4">
          <h2>가입된 동아리</h2>
          <p>동아리정보</p>
          <p><a class="btn btn-default" href="#" role="button">자세히 보기 &raquo;</a></p>
        </div>
        <div class="col-md-4">
          <h2>가입된 동아리</h2>
          <p>동아리정보</p>
          <p><a class="btn btn-default" href="#" role="button">자세히 보기 &raquo;</a></p>
       </div>
        <div class="col-md-4">
          <h2>가입된 동아리</h2>
          <p>동아리정보</p>
          <p><a class="btn btn-default" href="#" role="button">자세히 보기 &raquo;</a></p>
        </div>
      </div>

      <hr>

      <footer>
        <p>&copy; bdi club</p>
      </footer>
    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="${resPath}/js/bootstrap.min.js"></script>
  </body>
  
  <script>
  		function goUI(){
  			// 유저정보 페이지로 감
  		}
  
  </script>
</html>
