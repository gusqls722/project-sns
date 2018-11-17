
function SignIn(){
	  if(SandR == 0){
		    var data = {id:id.value,password:pwd.value};
		    var conf = {
		    		url:'/uis',
		    		method:'GET',
		    		param:JSON.stringify(data),
		    		success : function(res){
		    			alert('로그인 성공');
		    			res = JSON.pares(res);
		    		}
		    }
		    au.send(conf);
	  }else if(SandR == 1){
		    var data = {userid:id.value,userpwd:pwd.value,username:nameObj.value,useremail:email.value,userbirth:birth.value,usergender:gender.value};
		    var conf = {
					url:'/uis',
					method:'POST', 
					param : JSON.stringify(data),
					success : function(res){ 
						alert('성공');
						res = JSON.parse(res);
					}
			}
			au.send(conf);
	  }
}


function validate(){
	
	  if(SandR==0){
		    if(id.value!="" && pwd.value!=""){
			      btn.disabled=false;
			      btn.style.backgroundColor='#6AA3AC';
		    }else {
			      btn.disabled=true;
			      btn.style.backgroundColor='darkgray';
		    }
	  }else if(SandR==1){
			  var cpwd = document.getElementById("userPwdCheck");
			  var name = document.getElementById("userName");
			  var email = document.getElementById("userEmail");
			  var birth = document.getElementById("userBirth");
			  var gender = document.getElementById("gender");
			  var NCcheck =document.getElementById("NotCorrespond");
			  var Ccheck = document.getElementById("Correspond");
			  var pwdChecking;
			  if(pwd.value==cpwd.value && pwd.value!="" && cpwd.value!=""){
				  Ccheck.style.display="inline-block";
				  NCcheck.style.display="none";
				  pwdChecking=1;
			  }else if(pwd.value=="" && cpwd.value==""){
				  NCcheck.style.display="none";
				  Ccheck.style.display="none";
			  }else {
				  Ccheck.style.display="none";
				  NCcheck.style.display="inline-block";
				  pwdChecking=0;
			  }
			    if(id.value!="" && pwd.value!="" && cpwd.value!="" && nameObj.value!="" && email.value!="" && birth.value!="" && gender.value!="" && pwdChecking==1){
				      btn.disabled=false;
				      btn.style.backgroundColor='#E5D85C';
			    }else{
				      btn.disabled=true;
				      btn.style.backgroundColor='darkgray';
			    }
  }
  
}

  function Register(){
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
	
	    }else if(Rcount==1){
		      Rcount=Rcount-1;
		      alert("새로고침");
		      location.reload();
	    }
  }