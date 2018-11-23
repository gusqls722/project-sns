package com.sns.sp.dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sns.sp.dao.BoardInfoDAO;
import com.sns.sp.vo.BoardInfo;

@Repository
public class BoardInfoDAOImpl implements BoardInfoDAO {

	@Autowired
	private SqlSession ss;
	@Override
	public List<BoardInfo> selectboardInfoList() {
		return ss.selectList("com.sns.sp.BOARDINFO.BOARDINFOLIST");
	}

	@Override
	public BoardInfo selectboardInfoOne(int boardno) {
		return ss.selectOne("com.sns.sp.BOARDINFO.BOARDINFOONE",boardno);
	}

	@Override
	public Integer insertboardInfo(BoardInfo bi) {
		return ss.insert("com.sns.sp.BOARDINFO.insertBOARDINFO",bi);
	}

	@Override
	public Integer updateboardInfo(BoardInfo bi) {
		return ss.update("com.sns.sp.BOARDINFO.updateBOARDINFO",bi);
	}

	@Override
	public Integer deleteboardInfo(int boardno) {
		return ss.delete("com.sns.sp.BOARDINFO.deleteBOARDINFO",boardno);
	}

}
