package com.sns.sp.service;

import java.util.List;

import com.sns.sp.vo.boardInfo;

public interface boardInfoService {

	public List<boardInfo> selectboardInfoList();
	public boardInfo selectboardInfoOne(int boardno);
	public Integer insertboardInfo(boardInfo bi);
	public Integer updateboardInfo(boardInfo bi);
	public Integer deleteboardInfo(int boardno);
}
