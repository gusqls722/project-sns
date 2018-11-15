package com.sns.sp.dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sns.sp.dao.boardInfoDAO;
import com.sns.sp.vo.boardInfo;

@Repository
public class boardInfoDAOImpl implements boardInfoDAO {

	@Autowired
	private SqlSession ss;
	@Override
	public List<boardInfo> selectboardInfoList() {
		return ss.selectList("com.sns.sp.BOARDINFO.BOARDINFOLIST");
	}

	@Override
	public boardInfo selectboardInfoOne(int boardno) {
		return ss.selectOne("com.sns.sp.BOARDINFO.BOARDINFOONE",boardno);
	}

	@Override
	public Integer insertboardInfo(boardInfo bi) {
		return ss.insert("com.sns.sp.BOARDINFO.insertBOARDINFO",bi);
	}

	@Override
	public Integer updateboardInfo(boardInfo bi) {
		return ss.update("com.sns.sp.BOARDINFO.updateBOARDINFO",bi);
	}

	@Override
	public Integer deleteboardInfo(int boardno) {
		return ss.delete("com.sns.sp.BOARDINFO.deleteBOARDINFO",boardno);
	}

}
