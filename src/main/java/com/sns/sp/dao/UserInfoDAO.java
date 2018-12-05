package com.sns.sp.dao;

import java.util.List;

import com.sns.sp.vo.UserInfo;

public interface UserInfoDAO {

	public List<UserInfo> selectuserInfoList();
	public UserInfo selectuserInfoOne(int userno);
	public Integer insertuserInfo(UserInfo ui);
	public Integer updateuserInfo(UserInfo ui);
	public Integer deleteuserInfo(int userno);
	public UserInfo login(UserInfo ui);
	public UserInfo idCheck(String uiid);
	public String emailCheck(String uiid);
	public String userEmailCheck(String useremail);
	public Integer changePwd(String pwd,String uiid);
}
