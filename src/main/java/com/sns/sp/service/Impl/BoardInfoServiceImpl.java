package com.sns.sp.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.sp.dao.BoardInfoDAO;
import com.sns.sp.service.BoardInfoService;
import com.sns.sp.vo.BoardInfo;

@Service
public class BoardInfoServiceImpl implements BoardInfoService {

	@Autowired
	private BoardInfoDAO bdao;

	@Override
	public List<BoardInfo> selectboardInfoList() {
		return bdao.selectboardInfoList();
	}

	@Override
	public BoardInfo selectboardInfoOne(int boardno) {
		return bdao.selectboardInfoOne(boardno);
	}

	@Override
	public Integer insertboardInfo(BoardInfo bi) {
		return bdao.insertboardInfo(bi);
	}

	@Override
	public Integer updateboardInfo(BoardInfo bi) {
		return bdao.updateboardInfo(bi);
	}

	@Override
	public Integer deleteboardInfo(int boardno) {
		return bdao.deleteboardInfo(boardno);
	}

	@Override
	public List<BoardInfo> popularBoardInfo() {
		return bdao.popularBoardInfo();
	}

}

