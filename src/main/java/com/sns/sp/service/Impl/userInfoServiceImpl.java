package com.sns.sp.service.Impl;

import java.util.List;


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
	

}
