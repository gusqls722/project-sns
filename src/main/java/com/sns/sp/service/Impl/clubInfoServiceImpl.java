package com.sns.sp.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.sp.dao.clubInfoDAO;
import com.sns.sp.service.clubInfoService;
import com.sns.sp.vo.clubInfo;

@Service
public class clubInfoServiceImpl implements clubInfoService {

	@Autowired
	private clubInfoDAO cidao;
	
	@Override
	public List<clubInfo> selectclubInfoList() {
		return cidao.selectclubInfoList();
	}

	@Override
	public Integer insertclubInfo(clubInfo ci) {
		return cidao.insertclubInfo(ci);
	}

	@Override
	public Integer updateclubInfo(clubInfo ci) {
		return cidao.updateclubInfo(ci);
	}

	@Override
	public Integer deleteclubInfo(int chatno) {
		return cidao.deleteclubInfo(chatno);
	}

}
