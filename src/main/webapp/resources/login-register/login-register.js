
function SignIn(){		
	  if(SandR == 0){			//로그인을 눌렀을 때
		  	alert('로그인');
		    var data = {userid:id.value,userpwd:pwd.value};
		    var conf = {
		    		url : '/uis/login',
		    		method : 'POST',
		    		param : JSON.stringify(data),
		    		success : function(res){
		    			res = JSON.parse(res);
		    			alert(res.msg);
		    			
		    			
		    		}
		    }
		    au.send(conf);
	  }else if(SandR == 1){		//회원가입을 눌렀을 때
		    var data = {userid:id.value,userpwd:pwd.value,username:nameObj.value,useremail:email.value,userbirth:birth.value,usergender:gender.value};
		    var conf = {
					url:'/uis',
					method:'POST', 
					param : JSON.stringify(data),
					success : function(res){ 
						res = JSON.parse(res);
						alert(res.msg);
						location.reload();
					}
			}
			au.send(conf);
	  }
}


function validate(){		// 모든 값을 다 입력했으면 버튼 활성화
	
	  if(SandR==0){		//로그인일때
		    if(id.value!="" && pwd.value!=""){
			      btn.disabled=false;
			      btn.style.backgroundColor='#6AA3AC';
		    }else {
			      btn.disabled=true;
			      btn.style.backgroundColor='darkgray';
		    }
	  }else if(SandR==1){	// 회원가입일때
			  var cpwd = document.getElementById("userPwdCheck");
			  var name = document.getElementById("userName");
			  var email = document.getElementById("userEmail");
			  var birth = document.getElementById("userBirth");
			  var gender = document.getElementById("gender");
			  var NCcheck =document.getElementById("NotCorrespond");
			  var Ccheck = document.getElementById("Correspond");
			  var pwdChecking;
			  var Notpwdlength = document.getElementById("Notpwdlength");
			  var pwdlength = document.getElementById("pwdlength");
			  var pwdLenCheck=0;

			  // 비밀번호와 비밀번호 확인이 같은지 검사
			  if(pwd.value==cpwd.value && pwd.value!="" && cpwd.value!=""){
				  Ccheck.style.display="inline-block";
				  NCcheck.style.display="none";
				  pwdChecking=1;
			  }else if(pwd.value=="" || cpwd.value==""){
				  NCcheck.style.display="none";
				  Ccheck.style.display="none";
			  }else {
				  Ccheck.style.display="none";
				  NCcheck.style.display="inline-block";
				  pwdChecking=0;
			  }
			  // 비밀번호 8글자 이상인지 검사
			  if(pwd.value.length>=8){
				  pwdlength.style.display='inline-block';
				  Notpwdlength.style.display='none';
				  pwdLenCheck=1;
			  }else if(pwd.value==""){
				  pwdlength.style.display='none';
				  Notpwdlength.style.display='none';
			  }else{
				  pwdlength.style.display='none';
				  Notpwdlength.style.display='inline-block';
			  }
			    if(id.value!="" && pwd.value!="" && cpwd.value!="" && nameObj.value!="" && email.value!="" && birth.value!="" && gender.value!="" && pwdChecking==1 && pwdLenCheck==1 && idcheckcount==0){
				      btn.disabled=false;
				      btn.style.backgroundColor='#E5D85C';
			    }else{
				      btn.disabled=true;
				      btn.style.backgroundColor='darkgray';
			    }
  }
  
}

  function Register(){			//회원가입 버튼을 눌렀을 때
	    if(Rcount==0){
			    document.getElementById("logo").style="display:none";
			    SandR = 1;
			    Rcount= Rcount+1;
			    var newElement = "Confirm Password<div id='NotCorrespond'>(비밀번호 불일치)</div><div id='Correspond'>(비밀번호 일치)</div><input type='password' id='userPwdCheck'>";
			    newElement += "<br>Full Name<br><input type='text' id='userName'>";
			    newElement += "<br>Email<br><input type='text' id='userEmail'>";
			    newElement += "<br>Birth<br><input type='date' id='userBirth'>";
			    newElement += "<br>Gender<br><select id='gender'><option value=''>성별을 선택해주세요</option><option value='1'>man</option><option value='2'>woman</option></select>";
			    var image = document.getElementById("GIFImg");
			    var bg = document.getElementById("left");
			    var registerHref = document.getElementById("registerHref");
			    var title = document.querySelector("#title>h2");
			    var forget = document.querySelector("#forget>a");
			    var regText = document.querySelector("#regText");
			    var idcheckbtn = document.getElementById("idcheckbtn");
			    pageTitle.innerText = '회원가입';
			    idcheckbtn.style.display='inline-block';
			    id.value=''; 
			    pwd.value='';
			    btn.textContent = 'Register'; 
			    btn.disabled="true";
			    btn.style.backgroundColor='darkgray';
			    forget.textContent = "";
			    title.textContent  = "Register for Club";
			    registerHref.textContent = "Cancel";
			    title.style.color="red";
			    bg.style.backgroundColor="#E5D85C";
			    image.src="https://s3.orbi.kr/data/emoticons/oribi_animated/006.gif";
			    pwd.insertAdjacentHTML("afterend",newElement);
			    cpwd = document.getElementById("userPwdCheck");
			    nameObj = document.getElementById("userName");
			    email = document.getElementById("userEmail");
			    birth = document.getElementById("userBirth");
			    gender = document.getElementById("gender");
			    cpwd.addEventListener('keyup',validate);
			    nameObj.addEventListener('keyup',validate);
			    email.addEventListener('keyup',validate);
			    birth.addEventListener('change',validate);
			    gender.addEventListener('change',validate);
	
	    }else if(Rcount==1){	// 회원가입창에서 나갈 때
		      Rcount=Rcount-1;
		      SandR = 0;
		      location.reload();
	    }
  }
  
 function idcheck(){			//아이디 중복 체크하기
	  var idcheck = document.getElementById("userId");
	  
	    var data = {userid:idcheck.value};
	    if(idcheck.value!="" && idcheck.value.length>=6){
		    var conf = {
					url:'/uis/check/'+idcheck.value,
					method:'GET', 
					param : JSON.stringify(data),
					success : function(res){ 
						res = JSON.parse(res);
						alert(res.msg);
						idcheckcount = res.value;
						if(true){
							validate();
						}
						if(res.value==0){	// 아이디가 중복되지 않을 때
						    var idcheckbtn = document.getElementById("idcheckbtn");
						    idcheckbtn.style.backgroundColor='#E5D85C';
						    pwd.focus();
						}else if(res.value==1){		//아이디가 중복되지 않을 때
							var idcheckbtn = document.getElementById("idcheckbtn");
						    idcheckbtn.style.backgroundColor='darkgray';
						    id.focus();
						}
					}
		    }
		    au.send(conf);
	    }else if(idcheck.value==""){
	    	var idcheckbtn = document.getElementById("idcheckbtn");
	    	alert('아이디를 입력해주세요.');
	    	idcheckbtn.style.backgroundColor='darkgray';
	    	id.focus();
	    }else{
	    	var idcheckbtn = document.getElementById("idcheckbtn");
	    	alert('아이디는 6글자 이상입니다.');
	    	idcheckbtn.style.backgroundColor='darkgray';
	    	id.focus();
	    }
 }