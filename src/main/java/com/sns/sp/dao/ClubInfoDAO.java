package com.sns.sp.dao;

import java.util.List;

import com.sns.sp.vo.ClubInfo;

public interface ClubInfoDAO {

	public List<ClubInfo> setClubInfoList();
	public ClubInfo setClubInfoOne(int clubno);
	public Integer insertClubInfo(ClubInfo clubInfo);
	public Integer updateClubInfo(ClubInfo clubInfo);
	public Integer deleteClubInfo(int clubno);
	
	
	
	
	public List<ClubInfo> myClub(String userid);
}
