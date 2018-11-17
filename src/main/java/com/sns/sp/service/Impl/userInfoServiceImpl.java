package com.sns.sp.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.sp.dao.userInfoDAO;
import com.sns.sp.service.userInfoService;
import com.sns.sp.vo.userInfo;

@Service
public class userInfoServiceImpl implements userInfoService {

	@Autowired
	private userInfoDAO udao;
	@Override
	public List<userInfo> selectuserInfoList() {
		return udao.selectuserInfoList();
	}
	@Override
	public userInfo selectuserInfoOne(int userno) {
		return udao.selectuserInfoOne(userno);
	}
		
	@Override
	public Integer insertuserInfo(userInfo ui) {
		return udao.insertuserInfo(ui);
	}	
	
	@Override
	public Integer updateuserInfo(userInfo ui) {
		return udao.updateuserInfo(ui);
	}
	@Override
	public Integer deleteuserInfo(int userno) {
		return udao.deleteuserInfo(userno);
	}
	@Override
	public Map<String,String> login(userInfo ui, Map<String,String> rMap) {
		rMap.put("login", "fail");
		rMap.put("msg", "아이디 및 비밀번호를 확인하세요.");
		if(ui.getUserid()==null) {
			return rMap;
		}
		
		userInfo uiList = udao.login(ui);
		if(uiList == null) {
			rMap.put("login", "fail");
			rMap.put("msg", "아이디 및 비밀번호를 확인하세요.");
			return rMap;
		}
		
		if(ui.getUserid().equals(uiList.getUserid())) {
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
			rMap.put("msg", "사용할 수 있는 아이디 입니다..");
			rMap.put("value", "0");
		}
		return rMap;
	}
	

}
