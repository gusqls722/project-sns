<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>로그인</title>
	<script>
    var pageTitle = document.querySelector('head title');

	</script>
</head>
<body>

<section class="layer">
	   <div class="all">
	     	 <div id="left">
			        <div id="all">
				          <div id="image"><image src="https://s3.orbi.kr/data/emoticons/oribi_animated/009.gif" height="550px" width="300px" id="GIFImg"></div><br>
				          <p id="imgText">
				          <h2>Maecenas mattis egestas</h2>
				          Erdum et malesuado fames ac ante ipsum primis<br>
				          in fouabus uspendisse porta.
				          </p>
			      </div>
	    	</div>
	
			    <div id="right">
				        <div id="rightText">
					          <div id="logo">
					           		<img height="100" width="100"src="https://t1.daumcdn.net/cfile/tistory/173776374F6B759A16"/>
					          </div>
					          <div id="title"><h2>Welcome to Club</h2></div>
					          <p class="userlogin"> 
							          ID <button id="idcheckbtn" onclick="idcheck()">중복확인</button><br><input id="userId" type="text"><br>
							          Password<span id='Notpwdlength'>(비밀번호는 8글자 이상입니다.)</span><span id='pwdlength'>(success)</span><br><input id="userPwd" type="password"><br>
							          <div id="forget" onclick="goForget()"><a href="#">forget password?<a></div>
					          </p>
					          <br>
					          <button disabled="true" id="SignIn">Sign in</button>
					          <div class="hrAll">
							             <div class="hr"><hr></div>
							              or
							             <div class="hr"><hr></div>
					          </div>
					             
					           <div class="register"> 
					              	 new member?<a onclick="Register()" id="registerHref">Register</a>
					           </div>
				       </div>
			  </div>
	  </div>
</section>
<script>
var id = document.getElementById("userId");
var pwd = document.getElementById("userPwd");
var btn = document.getElementById('SignIn');
var idcheckcount; var cpwd ; var name; var email; var birth; var gender;
var SandR = 0;
var Rcount = 0;
btn.addEventListener('click',SignIn);
id.addEventListener('keyup',validate);
pwd.addEventListener('keyup',validate);
</script>
</body>
</html>