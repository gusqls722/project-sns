package com.sns.sp.dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sns.sp.dao.clubInfoDAO;
import com.sns.sp.vo.clubInfo;
import com.sns.sp.vo.clubInfo;

@Repository
public class clubInfoDAOImpl implements clubInfoDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<clubInfo> selectclubInfoList() {
		return ss.selectList("com.sns.sp.CLUBINFO.CLUBINFOLIST");
	}

	@Override
	public Integer insertclubInfo(clubInfo ci) {
		return ss.insert("com.sns.sp.CLUBINFO.insertCLUBINFO",ci);
	}

	@Override
	public Integer updateclubInfo(clubInfo ci) {
		return ss.update("com.sns.sp.CLUBINFO.updateCLUBINFO",ci);
	}

	@Override
	public Integer deleteclubInfo(int chatno) {
		return ss.delete("com.sns.sp.CLUBINFO.deleteCLUBINFO",chatno);
	}

}
