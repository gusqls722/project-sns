package com.sns.sp.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.sp.dao.ClubInfoDAO;
import com.sns.sp.dao.ClubUserDAO;
import com.sns.sp.service.ClubInfoService;
import com.sns.sp.vo.ClubInfo;

@Service
public class ClubInfoServiceImpl implements ClubInfoService {

	@Autowired
	private ClubInfoDAO cidao;
	@Autowired
	private ClubUserDAO cudao;
	
	@Override
	public List<ClubInfo> selectclubInfoList() {
		
		return cidao.selectclubInfoList();
	}

	@Override
	public List<ClubInfo> selectclubInfoListTop() {
		return cidao.selectclubInfoListTop();
	}
	
	@Override
	public ClubInfo selectclubInfoOne(int cino) {
		return cidao.selectclubInfoOne(cino);
	}
	
	@Override
	public Integer insertclubInfo(ClubInfo ci) {
		 int rs = cidao.insertclubInfo(ci);
		 int rs2 = cudao.insertclubUser(ci);
		 return 1;
	}

	@Override
	public Integer updateclubInfo(ClubInfo ci) {
		return cidao.updateclubInfo(ci);
	}

	@Override
	public Integer deleteclubInfo(int cino) {
		return cidao.deleteclubInfo(cino);
	}





}
