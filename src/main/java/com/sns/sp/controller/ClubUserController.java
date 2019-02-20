package com.sns.sp.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sns.sp.service.ClubUserService;

@Controller
public class ClubUserController {

	@Autowired
	private ClubUserService cus;

	@PostMapping("/clubusers/join") // 클럽 가입하기
	public @ResponseBody Map<String, String> joinClub(HttpSession hs, HttpServletRequest req) {
		Map<String, String> rMap = new HashMap<String, String>();
		hs = req.getSession();
		cus.joinClub(hs, rMap);
		return rMap;
	}

	@DeleteMapping("/clubusers/absent")
	public @ResponseBody Map<String, String> absentClub(HttpSession hs, HttpServletRequest req) {
		Map<String, String> rMap = new HashMap<String, String>();
		hs = req.getSession();
		cus.absentClub(hs, rMap);
		return rMap;
	}
}
