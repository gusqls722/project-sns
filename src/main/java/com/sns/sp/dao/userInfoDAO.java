package com.sns.sp.dao;

import java.util.List;

import com.sns.sp.vo.userInfo;

public interface userInfoDAO {

	public List<userInfo> selectuserInfoList();
	public userInfo selectuserInfoOne(int userno);
	public Integer insertuserInfo(userInfo ui);
	public Integer updateuserInfo(userInfo ui);
	public Integer deleteuserInfo(int userno);
}
