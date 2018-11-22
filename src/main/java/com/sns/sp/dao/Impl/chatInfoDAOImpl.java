package com.sns.sp.dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sns.sp.dao.chatInfoDAO;
import com.sns.sp.vo.chatInfo;

@Repository
public class chatInfoDAOImpl implements chatInfoDAO{

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<chatInfo> selectchatInfoList() {
		return ss.selectList("com.sns.sp.CHATINFO.CHATINFOLIST");
	}

	@Override
	public Integer insertchatInfo(chatInfo ci) {
		return ss.insert("com.sns.sp.CHATINFO.insertCHATINFO",ci);
	}

	@Override
	public Integer updatechatInfo(chatInfo ci) {
		return ss.update("com.sns.sp.CHATINFO.updateCHATINFO",ci);
	}

	@Override
	public Integer deletechatInfo(int chatno) {
		return ss.delete("com.sns.sp.CHATINFO.deleteCHATINFO",chatno);
	}

}
