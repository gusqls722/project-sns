/**
 * 
 */

function goForget() {
	var option = 'width=400px, height=400px, toolbar=no, top=100';
	var title = '이메일인증'
	var uri = '/uri/login/pwdforget';
	window.open(uri, title, option);
}