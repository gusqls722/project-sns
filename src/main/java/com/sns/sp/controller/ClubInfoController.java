package com.sns.sp.controller;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sns.sp.service.ClubInfoService;
import com.sns.sp.vo.ClubInfo;

@Controller
public class ClubInfoController {

	@Autowired
	private ClubInfoService cis;
	
	@GetMapping("/clubinfos")
	public @ResponseBody List<ClubInfo> getClubInfoList(@ModelAttribute ClubInfo clubinfo){
		return cis.setClubInfoList();
	}
	
	@GetMapping("/clubinfos/member")	// (메인페이지) 내가 가입한 클럽 리스트
	public @ResponseBody List<ClubInfo> myClubList(@ModelAttribute ClubInfo clubinfo, HttpSession hs, HttpServletRequest req){
		hs = req.getSession();
		return cis.myClub(hs);
	}
	
	@PostMapping("/clubinfos/create")	// 클럽만들기
	public @ResponseBody Map<String,String> createClub(@RequestBody ClubInfo clubinfo){
		Map<String,String> rMap = new HashMap<String,String>();
		cis.createClub(clubinfo, rMap);
		return rMap;
	}
}
