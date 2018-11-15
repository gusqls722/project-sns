package com.sns.sp.dao;

import java.util.List;

import com.sns.sp.vo.boardInfo;

public interface boardInfoDAO {

	public List<boardInfo> selectboardInfoList();
	public boardInfo selectboardInfoOne(int boardno);
	public Integer insertboardInfo(boardInfo bi);
	public Integer updateboardInfo(boardInfo bi);
	public Integer deleteboardInfo(int boardno);
}
