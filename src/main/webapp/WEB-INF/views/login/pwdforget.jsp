<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>이메일인증</title>
</head>
<body>
<h3>이메일 인증</h3>
아이디를 입력해주세요.<br>
<input type="text" id="userid"><br>

<button onclick="goMail()" id="gomailbtn">아이디확인</button>
<script>
function goMail(){
	var mailbtn = document.getElementById('gomailbtn');
	mailbtn.disabled=true;
	var userid = document.getElementById('userid');
	
	var data = {userid:userid.value};
	var conf = {
			url : '/uis/midcheck/'+userid.value,
			method : 'GET',
			success : function(res){
				res = JSON.parse(res);
				if(res.value==0){		// 이메일이 보내진다.
					location = '/uri/login/pwdforget2';
				}else if(res.value==1){ // 이메일이 안보내진다.
					alert(res.msg);
					window.close();
				}
			}
	}
	au.send(conf);
}

</script>
</body>
</html>