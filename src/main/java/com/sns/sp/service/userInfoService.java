package com.sns.sp.service;

import java.util.List;

import com.sns.sp.vo.userInfo;

public interface userInfoService {

	public List<userInfo> selectuserInfoList();
	public userInfo selectuserInfoOne(int userno);
	public Integer insertuserInfo(userInfo ui);
	public Integer updateuserInfo(userInfo ui);
	public Integer deleteuserInfo(int userno);
}
