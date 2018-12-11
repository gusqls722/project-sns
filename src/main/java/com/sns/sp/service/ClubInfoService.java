package com.sns.sp.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.sns.sp.vo.ClubInfo;

public interface ClubInfoService {

	public List<ClubInfo> setClubInfoList();
	public ClubInfo setClubInfoOne(int clubno);
	public Integer insertClubInfo(ClubInfo clubInfo);
	public Integer updateClubInfo(ClubInfo clubInfo);
	public Integer deleteClubInfo(int clubno);
	
	
	public List<ClubInfo> myClub(HttpSession hs);
}
