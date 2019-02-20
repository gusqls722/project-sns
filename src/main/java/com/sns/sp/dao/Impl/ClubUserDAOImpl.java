package com.sns.sp.dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sns.sp.dao.ClubUserDAO;
import com.sns.sp.vo.ClubInfo;
import com.sns.sp.vo.UserInfo;

@Repository
public class ClubUserDAOImpl implements ClubUserDAO {

	@Autowired
	private SqlSession ss;

	@Override
	public Integer insertclubUser(ClubInfo clubinfo) {
		return ss.insert("com.sns.sp.CLUBUSER.CREATECLUB", clubinfo);
	}

	@Override
	public List<Integer> affiliatedClub(String userid) {
		return ss.selectList("com.sns.sp.CLUBUSER.AFFILIATEDCLUB", userid);
	}

	@Override
	public Integer joinClub(UserInfo userInfo) {
		return ss.insert("com.sns.sp.CLUBUSER.JOINCLUB", userInfo);
	}

	@Override
	public Integer duplicationJoin(UserInfo userInfo) {
		return ss.selectOne("com.sns.sp.CLUBUSER.DUPLICATIONJOIN", userInfo);
	}

	@Override
	public Integer absentUser(UserInfo userinfo) {
		return ss.delete("com.sns.sp.CLUBUSER.DELETECLUB", userinfo);
	}

}
