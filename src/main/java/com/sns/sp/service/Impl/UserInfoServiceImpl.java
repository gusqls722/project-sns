package com.sns.sp.service.Impl;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.sp.dao.UserInfoDAO;
import com.sns.sp.service.UserInfoService;
import com.sns.sp.util.MessageSender;
import com.sns.sp.vo.UserInfo;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoDAO udao;
	@Override
	public List<UserInfo> selectuserInfoList() {
		return udao.selectuserInfoList();
	}
	@Override
	public UserInfo selectuserInfoOne(int userno) {
		return udao.selectuserInfoOne(userno);
	}
		
	@Override
	public Map<String,String> insertuserInfo(UserInfo ui,Map<String,String> rMap) {
		if(udao.insertuserInfo(ui)==1) {
			rMap.put("reg", "success");
			rMap.put("msg", "회원가입이 되셨습니다.");
		}else {
			rMap.put("reg", "fail");
			rMap.put("msg", "다시한번 확인해주세요.");
		}
		
		return rMap;
	}	
	
	@Override
	public Integer updateuserInfo(UserInfo ui) {
		return udao.updateuserInfo(ui);
	}
	@Override
	public Integer deleteuserInfo(int userno) {
		return udao.deleteuserInfo(userno);
	}
	@Override
	public Map<String,String> login(UserInfo ui, Map<String,String> rMap,HttpServletRequest req) {
		HttpSession session= req.getSession();
		
		rMap.put("login", "fail");
		rMap.put("msg", "아이디 및 비밀번호를 확인하세요.");
		if(ui.getUserid()==null) {
			return rMap;
		}
		
		UserInfo uiVO = udao.login(ui);
		if(uiVO == null) {
			rMap.put("login", "fail");
			rMap.put("msg", "아이디 및 비밀번호를 확인하세요.");
		}else if(ui.getUserid().equals(uiVO.getUserid())) {
			if(ui.getUserpwd().equals(uiVO.getUserpwd())) {
				if(uiVO.getUsergender()=="1") {
					uiVO.setUsergender("남자");
				}else if(uiVO.getUsergender()=="2") {
					uiVO.setUsergender("여자");
				}
				req.setAttribute("user", uiVO);
				rMap.put("login", "seccess");
				rMap.put("msg", uiVO.getUsername()+"님 로그인 되었습니다.");
				session.setAttribute("user", uiVO);
			}
		}
		
		return rMap;
	}
	@Override
	public Map<String, String> idcheck(String userid, Map<String, String> rMap) {
		if(udao.idCheck(userid)!=null) {
			rMap.put("reg", "fail");
			rMap.put("msg", "이미 있는 아이디 입니다.");
			rMap.put("value", "1");
			return rMap;
		}else if(udao.idCheck(userid)==null) {
			rMap.put("reg", "success");
			rMap.put("msg", "사용할 수 있는 아이디 입니다.");
			rMap.put("value", "0");
		}
		return rMap;
	}
	@Override
	public Map<String, String> midcheck(String userid, Map<String, String> rMap) {
		if(udao.idCheck(userid)!=null) {
			rMap.put("reg", "fail");
			rMap.put("msg", "존재하지 않는 아이디 입니다.");
			rMap.put("value", "1");
			return rMap;
		}else if(udao.idCheck(userid)==null) {
			rMap.put("reg", "success");
			/*rMap.put("msg", "사용할 수 있는 아이디 입니다.");*/
			rMap.put("value", "0");
		}
		return rMap;
	}
	@Override
	public Map<String, String> emailcheck(String userid, Map<String, String> rMap) {
		rMap.put("reg", "fail");
		rMap.put("msg", "아이디가 존재하지 않습니다.");
		rMap.put("value", "1");
		if(udao.emailCheck(userid)!=null) {
			String email = udao.emailCheck(userid);
			String newPwd= MessageSender.sendmail(email);
			udao.changePwd(newPwd, userid);
			rMap.put("reg", "success");
			rMap.put("msg", email+"등록하신 이메일로 메일을 전송하였습니다.");
			rMap.put("value", "0");
		}

		return rMap;
	}
	@Override
	public Map<String, String> sessioncheck(Map<String, String> rMap, HttpSession session) {
		if(session.getAttribute("user")==null) {
			rMap.put("reg", "fail");
			rMap.put("msg", "다시 로그인 해주세요.");
			rMap.put("value", "0");
		}else {
			rMap.put("reg", "success");
			rMap.put("msg", "세션이 있다.");
			rMap.put("value", "1");
		}
		
		return rMap;
	}
	@Override
	public Map<String, String> userEmailCheck(String useremail, Map<String, String> rMap) {
		String emailvalue = udao.userEmailCheck(useremail);
		if(emailvalue==null) {
			String email = emailvalue;
			rMap.put("reg", "success");
			rMap.put("msg", "사용가능한 이메일 입니다.");
			rMap.put("value", "1");
		}else {
			rMap.put("reg", "fail");
			rMap.put("msg", "이미 존재하는 이메일 입니다.");
			rMap.put("value", "0");
		}
		return rMap;
	}
	
	

}
