package com.sns.sp.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.sp.dao.ClubRequestDAO;
import com.sns.sp.service.ClubRequestService;
import com.sns.sp.vo.ClubRequest;
import com.sns.sp.vo.ClubRequest;

@Service
public class ClubRequestServiceImpl implements ClubRequestService {

	@Autowired
	private ClubRequestDAO crdao;
	
	@Override
	public List<ClubRequest> selectclubRequestList() {
		return crdao.selectclubRequestList();
	}

	@Override
	public Integer insertclubRequest(ClubRequest cr) {
		return crdao.insertclubRequest(cr);
	}

	@Override
	public Integer updateclubRequest(ClubRequest cr) {
		return crdao.updateclubRequest(cr);
	}

	@Override
	public Integer deleteclubRequest(int clubreqno) {
		return crdao.deleteclubRequest(clubreqno);
	}

}