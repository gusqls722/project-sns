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
email을 입력해주세요<br>
<input type="text" id="emailid">
<button onclick="goMail()" id="gomailbtn">인증보내기</button>
<script>
function goMail(){
	var mailbtn = document.getElementById('gomailbtn');
	mailbtn.disabled=true;
	var userid = document.getElementById('userid');
	var emailid = document.getElementById('emailid');
	
	var data = {userid:userid.value, emailid:emailid.value};
	var conf = {
			url : '/uis/mail/'+userid.value+'/'+emailid.value,
			method : 'GET',
			param : JSON.stringify(data),
			success : function(res){
				res = JSON.parse(res);
				if(res.value==0){		// 이메일이 보내진다.
					alert(res.msg);
					window.close();
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