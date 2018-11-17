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
	public Map<String, String> insertuserInfo(userInfo ui, Map<String,String> rMap) {
		if(udao.selectuserInfoOneForId(ui.getUserid())!=null) {
			rMap.put("reg", "fail");
			rMap.put("msg", "이미 있는 아이디 입니다.");
			return rMap;
		}else if(udao.selectuserInfoOneForId(ui.getUserid())==null) {
			rMap.put("reg", "success");
			rMap.put("msg", "회원가입에 성공하셨습니다.");
			udao.insertuserInfo(ui);
		}
		return rMap;
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
	public userInfo login(userInfo ui) {
		return null;
	}
	
	

}
