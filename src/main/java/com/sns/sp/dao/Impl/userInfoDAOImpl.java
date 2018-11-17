package com.sns.sp.dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sns.sp.dao.userInfoDAO;
import com.sns.sp.vo.userInfo;

@Repository
public class userInfoDAOImpl implements userInfoDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<userInfo> selectuserInfoList() {
		return ss.selectList("com.sns.sp.USERINFO.selectUSERINFOLIST");
	}

	@Override
	public userInfo selectuserInfoOne(int userno) {
		return ss.selectOne("com.sns.sp.USERINFO.selectUSERINFOONE",userno);
	}
	
	@Override
	public userInfo selectuserInfoOneForId(String userid) {
		return ss.selectOne("com.sns.sp.USERINFO.selectUSERINFOForId");
	}

	@Override
	public Integer insertuserInfo(userInfo ui) {
		return ss.insert("com.sns.sp.USERINFO.insertUSERINFO",ui);
	}

	@Override
	public Integer updateuserInfo(userInfo ui) {
		return ss.update("com.sns.sp.USERINFO.updateUSERINFO",ui);
	}

	@Override
	public Integer deleteuserInfo(int userno) {
		return ss.delete("com.sns.sp.USERINFO.deleteUSERINFO",userno);
	}

	@Override
	public userInfo login(userInfo ui) {
		return ss.selectOne("com.sns.sp.USERINFO.loginuserInfo",ui);
	}
}
