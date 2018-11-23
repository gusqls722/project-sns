package com.sns.sp.dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sns.sp.dao.ClubInfoDAO;
import com.sns.sp.vo.ClubInfo;
import com.sns.sp.vo.ClubInfo;

@Repository
public class ClubInfoDAOImpl implements ClubInfoDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<ClubInfo> selectclubInfoList() {
		return ss.selectList("com.sns.sp.CLUBINFO.CLUBINFOLIST");
	}

	@Override
	public Integer insertclubInfo(ClubInfo ci) {
		return ss.insert("com.sns.sp.CLUBINFO.insertCLUBINFO",ci);
	}

	@Override
	public Integer updateclubInfo(ClubInfo ci) {
		return ss.update("com.sns.sp.CLUBINFO.updateCLUBINFO",ci);
	}

	@Override
	public Integer deleteclubInfo(int chatno) {
		return ss.delete("com.sns.sp.CLUBINFO.deleteCLUBINFO",chatno);
	}

}
