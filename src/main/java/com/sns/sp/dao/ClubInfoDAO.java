package com.sns.sp.dao;

import java.util.List;

import com.sns.sp.vo.ClubInfo;

public interface ClubInfoDAO {

	public List<ClubInfo> selectclubInfoList();
	public List<ClubInfo> selectclubInfoListTop();
	public ClubInfo selectclubInfoOne(int cino);
	public Integer insertclubInfo(ClubInfo ci);
	public Integer updateclubInfo(ClubInfo ci);
	public Integer deleteclubInfo(int cino);
}
