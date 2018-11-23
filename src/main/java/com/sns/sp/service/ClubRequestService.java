package com.sns.sp.service;

import java.util.List;

import com.sns.sp.vo.ClubRequest;

public interface ClubRequestService {

	public List<ClubRequest> selectclubRequestList();
	public Integer insertclubRequest(ClubRequest ci);
	public Integer updateclubRequest(ClubRequest ci);
	public Integer deleteclubRequest(int clubreqno);
}
