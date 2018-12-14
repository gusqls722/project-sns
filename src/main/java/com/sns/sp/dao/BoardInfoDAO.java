package com.sns.sp.dao;

import java.util.List;

import com.sns.sp.vo.BoardInfo;

public interface BoardInfoDAO {

	public List<BoardInfo> selectboardInfoList();
	public BoardInfo selectboardInfoOne(int boardno);
	public Integer insertboardInfo(BoardInfo bi);
	public Integer updateboardInfo(BoardInfo bi);
	public Integer deleteboardInfo(int boardno);
	
	
	public List<BoardInfo> popularBoardInfo();
}

