package com.sns.sp.service.Impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.sp.dao.ClubInfoDAO;
import com.sns.sp.dao.ClubUserDAO;
import com.sns.sp.service.ClubInfoService;
import com.sns.sp.vo.ClubInfo;
import com.sns.sp.vo.UserInfo;

@Service
public class ClubInfoServiceImpl implements ClubInfoService{

	@Autowired
	private ClubInfoDAO cidao;
	
	@Autowired
	private ClubUserDAO cudao;
	
	@Override
	public List<ClubInfo> setClubInfoList() {
		// TODO Auto-generated method stub
		return cidao.setClubInfoList();
	}

	@Override
	public ClubInfo setClubInfoOne(int clubno) {
		// TODO Auto-generated method stub
		return cidao.setClubInfoOne(clubno);
	}

	@Override
	public Integer insertClubInfo(ClubInfo clubInfo) {
		// TODO Auto-generated method stub
		return cidao.insertClubInfo(clubInfo);
	}

	@Override
	public Integer updateClubInfo(ClubInfo clubInfo) {
		// TODO Auto-generated method stub
		return cidao.updateClubInfo(clubInfo);
	}

	@Override
	public Integer deleteClubInfo(int clubno) {
		// TODO Auto-generated method stub
		return cidao.deleteClubInfo(clubno);
	}
	
	
	@Override
	public List<ClubInfo> myClub(HttpSession hs) {
		UserInfo userinfo = (UserInfo) hs.getAttribute("user");
		String userid = userinfo.getUserid();
		List<Integer> affiliatedClub = cudao.affiliatedClub(userid);
		List<ClubInfo> myClubList = new ArrayList<ClubInfo>();
		for(int affil:affiliatedClub) {
			myClubList.add(cidao.myClub(affil));
		}
		return myClubList;
	}

}
