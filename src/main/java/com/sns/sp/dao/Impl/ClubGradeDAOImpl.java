package com.sns.sp.dao.Impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sns.sp.dao.ClubGradeDAO;
import com.sns.sp.vo.ClubInfo;

@Repository
public class ClubGradeDAOImpl implements ClubGradeDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public Integer createClubGrade(ClubInfo clubinfo) {
		return ss.insert("com.sns.sp.CLUBGRADE.CREATECLUBGRADE",clubinfo);
	}

}
