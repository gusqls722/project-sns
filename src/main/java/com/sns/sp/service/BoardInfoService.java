package com.sns.sp.service;

import java.util.List;

import com.sns.sp.vo.BoardInfo;

public interface BoardInfoService {

	public List<BoardInfo> selectboardInfoList();

	public BoardInfo selectboardInfoOne(int boardno);

	public Integer insertboardInfo(BoardInfo bi);

	public Integer updateboardInfo(BoardInfo bi);

	public Integer deleteboardInfo(int boardno);

	public List<BoardInfo> popularBoardInfo();
}
