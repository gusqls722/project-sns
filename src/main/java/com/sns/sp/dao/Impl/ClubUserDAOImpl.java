package com.sns.sp.dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sns.sp.dao.ClubUserDAO;
import com.sns.sp.vo.ClubInfo;
import com.sns.sp.vo.ClubUser;
@Repository
public class ClubUserDAOImpl implements ClubUserDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public Integer insertclubUser(ClubInfo clubinfo) {
		return ss.insert("com.sns.sp.CLUBUSER.CREATECLUB",clubinfo);
	}

	@Override
	public List<Integer> affiliatedClub(String userid) {
		return ss.selectList("com.sns.sp.CLUBUSER.AFFILIATEDCLUB",userid);
	}

}
