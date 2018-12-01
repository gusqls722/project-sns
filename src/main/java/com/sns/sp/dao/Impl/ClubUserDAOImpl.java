package com.sns.sp.dao.Impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sns.sp.dao.ClubUserDAO;
import com.sns.sp.vo.ClubInfo;
@Repository
public class ClubUserDAOImpl implements ClubUserDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public Integer insertclubUser(ClubInfo ci) {
		return ss.insert("com.sns.sp.CLUBUSER.CREATECLUB",ci);
	}

}
