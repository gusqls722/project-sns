package com.sns.sp.service.Impl;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.sns.sp.dao.ClubUserDAO;
import com.sns.sp.service.ClubUserService;
import com.sns.sp.vo.ClubInfo;
import com.sns.sp.vo.UserInfo;

public class ClubUserServiceImpl implements ClubUserService {

	@Override
	public Map<String, String> joinClub(HttpSession hs, Map<String,String> rMap) {
		if(hs.getAttribute("user")==null || hs.getAttribute("clubinfo")==null) {
			rMap.put("res", "fail");
			rMap.put("msg", "유저세션이나 클럽정보가 없습니다.");
			return rMap;
		}
		UserInfo ui = (UserInfo)hs.getAttribute("user");
		ClubInfo ci = (ClubInfo)hs.getAttribute("clubinfo");
		return null;
	}


}
