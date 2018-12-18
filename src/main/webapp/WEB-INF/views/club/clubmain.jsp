<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="common\session.jspf" %>

<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>실험용 클럽</title>
</head>
<body>
${rMap} <Br>
${clubinfo}

<button onclick="joinClub()">이 클럽 가입해야지</button>
</body>

<script>
	function joinClub(){
		var conf = {
				url : '/clubusers/join',
				method : 'POST',
				success : function(res){
					res = JSON.parse(res);
					alert(res.msg);
					alert(res.res);
					location.href = '/clubinfos/club/'+${clubinfo.clubno};
				},
				error : function(error){
					error = JSON.parse(error)
					alert(error.msg);
				}
		}
		au.send(conf);
	}
</script>
</html>