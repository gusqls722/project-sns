package com.sns.sp.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.sns.sp.vo.UserInfo;

public interface UserInfoService {

	public List<UserInfo> selectuserInfoList();
	public UserInfo selectuserInfoOne(int userno);
	public Map<String,String> insertuserInfo(UserInfo ui,Map<String,String> rMap);
	public Integer updateuserInfo(UserInfo ui);
	public Integer deleteuserInfo(int userno);
	public Map<String,String> login(UserInfo ui,Map<String,String> rMap,HttpServletRequest req);
	public Map<String,String> idcheck(String userid,Map<String,String> rMap);
	public Map<String,String> emailcheck(String userid, Map<String,String> rMap);
	public Map<String,String> sessioncheck(Map<String,String> rMap,HttpSession session);
}
