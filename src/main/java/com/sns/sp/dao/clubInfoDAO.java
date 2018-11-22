package com.sns.sp.dao;

import java.util.List;

import com.sns.sp.vo.clubInfo;

public interface clubInfoDAO {

	public List<clubInfo> selectclubInfoList();
	public Integer insertclubInfo(clubInfo ci);
	public Integer updateclubInfo(clubInfo ci);
	public Integer deleteclubInfo(int clubno);
}
