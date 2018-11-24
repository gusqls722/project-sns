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
          <form class="form-inline">
          <a class="navbar-brand" href="#">로고</a>
          <div class="form-group">
           	<input type="text" class="form-control" id="search" placeholder="검색할내용">
           	<button type="button" class="btn btn-default">검색</button>
          </div>
          </form>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <form class="navbar-form navbar-right">
              <button type="button" class="btn btn-default">회원정보</button>
             <button type="button" class="btn btn-default">로그아웃</button>
            <button type="button" class="btn btn-default">생각중인버튼</button>
            
          </form>
        </div><!--/.navbar-collapse -->
      </div>
    </nav>

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
      <table class="table">
      <tr>
        <th>동아리명</th>
        <th>회원수</th>
        <th>동아리 설명</th>
      </tr>
      <tr>
      	<td id="clubname"></td>
      	<td></td>
      	<td></td>
      </tr>
      </table>  
        <p><a class="btn btn-primary btn-lg" href="#" role="button">더많은 동아리 보기 &raquo;</a></p>
        <p><a class="btn btn-primary btn-lg" href="#" role="button">동아리 만들기 &raquo;</a></p>       
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
        <p class="text-center">&copy; bdi club</p>
      </footer>
    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="${resPath}/js/bootstrap.min.js"></script>
  </body>
</html>
