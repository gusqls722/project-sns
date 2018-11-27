package com.sns.sp.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.sp.dao.ClubInfoDAO;
import com.sns.sp.service.ClubInfoService;
import com.sns.sp.vo.ClubInfo;

@Service
public class ClubInfoServiceImpl implements ClubInfoService {

	@Autowired
	private ClubInfoDAO cidao;
	
	@Override
	public List<ClubInfo> selectclubInfoList() {
		
		return cidao.selectclubInfoList();
	}

	@Override
	public Integer insertclubInfo(ClubInfo ci) {
		return cidao.insertclubInfo(ci);
	}

	@Override
	public Integer updateclubInfo(ClubInfo ci) {
		return cidao.updateclubInfo(ci);
	}

	@Override
	public Integer deleteclubInfo(int chatno) {
		return cidao.deleteclubInfo(chatno);
	}

	@Override
	public List<ClubInfo> selectclubInfoListTop() {
		return cidao.selectclubInfoListTop();
	}

}
