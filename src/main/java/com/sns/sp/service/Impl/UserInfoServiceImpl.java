package com.sns.sp.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.sp.dao.UserInfoDAO;
import com.sns.sp.service.UserInfoService;
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
	public Map<String,String> login(UserInfo ui, Map<String,String> rMap) {
		rMap.put("login", "fail");
		rMap.put("msg", "아이디 및 비밀번호를 확인하세요.");
		if(ui.getUserid()==null) {
			return rMap;
		}
		
		UserInfo uiList = udao.login(ui);
		if(uiList == null) {
			rMap.put("login", "fail");
			rMap.put("msg", "아이디 및 비밀번호를 확인하세요.");
		}else if(ui.getUserid().equals(uiList.getUserid())) {
			if(ui.getUserpwd().equals(uiList.getUserpwd())) {
				rMap.put("login", "seccess");
				rMap.put("msg", uiList.getUsername()+"님 로그인 되었습니다.");
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
	public Map<String, String> emailcheck(String userid, Map<String, String> rMap) {
		rMap.put("reg", "success");
		rMap.put("msg", ")
		if(udao.emailCheck(userid).getUseremail()!="") {
			
		};
		return rMap;
	}
	

}
