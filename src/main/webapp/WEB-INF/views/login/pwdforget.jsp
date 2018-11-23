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
<input type="text" id="userid">
<button onclick="goMail()">인증보내기</button>
<script>
function goMail(){
	var userid = document.querySelector('#userid');
	var data = {userid:userid.value};
	var conf = {
			url : '/uis/mail'+userid,
			method : 'GET',
			param : JSON.stringify(data);
			success : function(res){
				res = JSON.parse(res);
			}
	}
	alert('아이디에 등록 된 이메일로 인증 메일을 보냅니다.');
}

</script>
</body>
</html>