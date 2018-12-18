package com.sns.sp.service.Impl;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.sp.dao.ClubUserDAO;
import com.sns.sp.service.ClubUserService;
import com.sns.sp.vo.ClubInfo;
import com.sns.sp.vo.UserInfo;

@Service
public class ClubUserServiceImpl implements ClubUserService {

	@Autowired
	private ClubUserDAO cudao;
	
	@Override
	public Map<String, String> joinClub(HttpSession hs, Map<String,String> rMap) {
		if(hs.getAttribute("user")==null || hs.getAttribute("clubinfo")==null) {
			rMap.put("res", "fail");
			rMap.put("msg", "유저세션이나 클럽정보가 없습니다.");
			return rMap;
		}
		
		UserInfo ui = (UserInfo)hs.getAttribute("user");
		ClubInfo ci = (ClubInfo)hs.getAttribute("clubinfo");
		ui.setClubInfo(ci);
		//System.out.println(cudao.duplicationJoin(ui));
		if(cudao.duplicationJoin(ui) != 1) {
			Integer result = cudao.joinClub(ui);
			if(result == 1) {
				rMap.put("res", "success");
				rMap.put("msg", "클럽에 가입되셨습니다.");
			}else {
				rMap.put("res", "fail");
				rMap.put("msg", "에러?");
			}
		}else{
			rMap.put("res", "fail");
			rMap.put("msg", "이미 가입된 유저입니다.");
		}
		return rMap;
	}


}
