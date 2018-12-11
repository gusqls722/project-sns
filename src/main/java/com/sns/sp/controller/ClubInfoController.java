package com.sns.sp.controller;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	@GetMapping("/clubinfos/member")
	public @ResponseBody List<ClubInfo> myClubList(@ModelAttribute ClubInfo clubinfo, HttpSession hs, HttpServletRequest req){
		hs = req.getSession();
		return cis.myClub(hs);
	}
}
