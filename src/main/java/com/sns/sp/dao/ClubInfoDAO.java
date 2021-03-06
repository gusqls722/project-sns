package com.sns.sp.dao;

import java.util.List;

import com.sns.sp.vo.ClubInfo;

public interface ClubInfoDAO {

	public List<ClubInfo> selectClubInfoList();

	public ClubInfo selectClubInfoOne(int clubno);

	public Integer insertClubInfo(ClubInfo clubInfo);

	public Integer updateClubInfo(ClubInfo clubInfo);

	public Integer deleteClubInfo(int clubno);

	public ClubInfo myClub(int clubno);

	public Integer createClub(ClubInfo clubinfo);

	public ClubInfo JoinClub(int clubno);
}
