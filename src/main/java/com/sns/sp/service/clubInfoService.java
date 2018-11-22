package com.sns.sp.service;

import java.util.List;

import com.sns.sp.vo.clubInfo;

public interface clubInfoService {

	public List<clubInfo> selectclubInfoList();
	public Integer insertclubInfo(clubInfo ci);
	public Integer updateclubInfo(clubInfo ci);
	public Integer deleteclubInfo(int clubno);
}
