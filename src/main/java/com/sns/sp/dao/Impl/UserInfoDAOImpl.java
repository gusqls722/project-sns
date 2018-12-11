package com.sns.sp.dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sns.sp.dao.UserInfoDAO;
import com.sns.sp.vo.UserInfo;

@Repository
public class UserInfoDAOImpl implements UserInfoDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<UserInfo> selectuserInfoList() {
		return ss.selectList("com.sns.sp.USERINFO.selectUSERINFOLIST");
	}

	@Override
	public UserInfo selectuserInfoOne(int userno) {
		return ss.selectOne("com.sns.sp.USERINFO.selectUSERINFOONE",userno);
	}
	
	@Override
	public UserInfo idCheck(String userid) {
		return ss.selectOne("com.sns.sp.USERINFO.idCheck", userid);
	}

	@Override
	public Integer registerUserInfo(UserInfo ui) {
		return ss.insert("com.sns.sp.USERINFO.registerUSERINFO",ui);
	}

	@Override
	public Integer updateuserInfo(UserInfo ui) {
		return ss.update("com.sns.sp.USERINFO.updateUSERINFO",ui);
	}

	@Override
	public Integer deleteuserInfo(int userno) {
		return ss.delete("com.sns.sp.USERINFO.deleteUSERINFO",userno);
	}

	@Override
	public UserInfo login(UserInfo ui) {
		return ss.selectOne("com.sns.sp.USERINFO.loginuserInfo",ui);
	}

	@Override
	public String midCheck(String uiid) {
		 String user = ss.selectOne("com.sns.sp.USERINFO.midCheck",uiid);
		 return user;
	}
	
	@Override
	public String emailCheck(String uiid) {
		String user = ss.selectOne("com.sns.sp.USERINFO.emailCheck",uiid);
		System.out.println(user);
		
		return user;
	}

	@Override
	public Integer changePwd(String pwd,String uiid) {
		UserInfo ui= new UserInfo();
		ui.setUserpwd(pwd);
		ui.setUserid(uiid);
		return ss.update("com.sns.sp.USERINFO.changePwd", ui);
	}

	@Override
	public String userEmailCheck(String email) {
		String useremail = ss.selectOne("com.sns.sp.USERINFO.userEmailCheck",email);
		return useremail;
	}
}
