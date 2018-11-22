package com.sns.sp.service;

import java.util.List;

import com.sns.sp.vo.clubRequest;

public interface clubRequestService {

	public List<clubRequest> selectclubRequestList();
	public Integer insertclubRequest(clubRequest ci);
	public Integer updateclubRequest(clubRequest ci);
	public Integer deleteclubRequest(int clubreqno);
}
