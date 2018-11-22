package com.sns.sp.dao;

import java.util.List;

import com.sns.sp.vo.clubRequest;

public interface clubRequestDAO {

	public List<clubRequest> selectclubRequestList();
	public Integer insertclubRequest(clubRequest ci);
	public Integer updateclubRequest(clubRequest ci);
	public Integer deleteclubRequest(int clubreqno);
}
