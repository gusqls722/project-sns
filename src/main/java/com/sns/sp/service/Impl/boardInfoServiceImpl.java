package com.sns.sp.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.sp.dao.boardInfoDAO;
import com.sns.sp.service.boardInfoService;
import com.sns.sp.vo.boardInfo;

@Service
public class boardInfoServiceImpl implements boardInfoService{

	@Autowired
	private boardInfoDAO bdao;
	@Override
	public List<boardInfo> selectboardInfoList() {
		return bdao.selectboardInfoList();
	}

	@Override
	public boardInfo selectboardInfoOne(int boardno) {
		return bdao.selectboardInfoOne(boardno);
	}

	@Override
	public Integer insertboardInfo(boardInfo bi) {
		return bdao.insertboardInfo(bi);
	}

	@Override
	public Integer updateboardInfo(boardInfo bi) {
		return bdao.updateboardInfo(bi);
	}

	@Override
	public Integer deleteboardInfo(int boardno) {
		return bdao.deleteboardInfo(boardno);
	}

}
