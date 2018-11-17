package com.sns.sp.service;

import java.util.List;
import java.util.Map;

import com.sns.sp.vo.userInfo;

public interface userInfoService {

	public List<userInfo> selectuserInfoList();
	public userInfo selectuserInfoOne(int userno);
	public Map<String,String> insertuserInfo(userInfo ui, Map<String,String> rMap);
	public Integer updateuserInfo(userInfo ui);
	public Integer deleteuserInfo(int userno);
	public userInfo login(userInfo ui);
}
