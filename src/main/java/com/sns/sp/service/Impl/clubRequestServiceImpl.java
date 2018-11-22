package com.sns.sp.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.sp.dao.clubRequestDAO;
import com.sns.sp.service.clubRequestService;
import com.sns.sp.vo.clubRequest;
import com.sns.sp.vo.clubRequest;

@Service
public class clubRequestServiceImpl implements clubRequestService {

	@Autowired
	private clubRequestDAO crdao;
	
	@Override
	public List<clubRequest> selectclubRequestList() {
		return crdao.selectclubRequestList();
	}

	@Override
	public Integer insertclubRequest(clubRequest cr) {
		return crdao.insertclubRequest(cr);
	}

	@Override
	public Integer updateclubRequest(clubRequest cr) {
		return crdao.updateclubRequest(cr);
	}

	@Override
	public Integer deleteclubRequest(int clubreqno) {
		return crdao.deleteclubRequest(clubreqno);
	}

}
