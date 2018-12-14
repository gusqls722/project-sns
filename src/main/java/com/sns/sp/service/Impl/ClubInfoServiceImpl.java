package com.sns.sp.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
	public List<ClubInfo> selectClubInfoList() {
		// TODO Auto-generated method stub
		return cidao.selectClubInfoList();
	}

	@Override
	public ClubInfo selectClubInfoOne(int clubno) {
		// TODO Auto-generated method stub
		return cidao.selectClubInfoOne(clubno);
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

	@Override
	public Map<String, String> createClub(ClubInfo clubinfo, Map<String,String> rMap) {
		Integer cc= cidao.createClub(clubinfo);
		if(cc==1) {
			rMap.put("res", "success");
			rMap.put("msg", "클럽이 정상적으로 만들어졌습니다.");
		}else {
			rMap.put("res", "fail");
			rMap.put("msg", "클럽생성실패");
		}
		return rMap;
	}

	@Override
	public HttpSession JoinClub(int clubno, HttpSession hs, Map<String,String> rMap) {	// 클럽들어가기
		if(cidao.selectClubInfoOne(clubno).getClubno()==null) {
			rMap.put("res", "fail");
			rMap.put("msg", "삭제되었거나 존재하지않는 클럽입니다.");
			return hs;
		}
		ClubInfo clubinfo = new ClubInfo();
		clubinfo=cidao.JoinClub(clubno);
		UserInfo userinfo = (UserInfo) hs.getAttribute("user");
		if(userinfo==null) {
			rMap.put("res", "fail");
			rMap.put("msg", "아이디 세션이 없습니다.");
			return hs;
		}
		String userid = userinfo.getUserid();
		List<Integer> affiliatedClub = cudao.affiliatedClub(userid);
		for(int affil:affiliatedClub) {
			if(affil==clubno) {
				rMap.put("res", "success");
				rMap.put("msg","해당 클럽 유저이십니다.");
				rMap.put("member", "1");
				hs.setAttribute("clubinfo", clubinfo);
				return hs;
			}else {
				rMap.put("res", "success");
				rMap.put("msg", "해당 클럽 유저가 아니십니다.");
				rMap.put("member", "0");
			}
		}
		clubinfo=cidao.JoinClub(clubno);
		hs.setAttribute("clubinfo", clubinfo);
		return hs;
	}

}
