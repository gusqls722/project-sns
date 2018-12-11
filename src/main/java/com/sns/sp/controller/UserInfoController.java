package com.sns.sp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sns.sp.service.UserInfoService;
import com.sns.sp.vo.UserInfo;

@Controller
public class UserInfoController {
	
	
	@Autowired
	private UserInfoService us;
	
	@GetMapping(value="/uis")
	public @ResponseBody List<UserInfo> getuserInfoList(@ModelAttribute UserInfo ui){
		return us.selectuserInfoList();
	}
	
	@GetMapping(value="/uis/{userno}")
	public @ResponseBody UserInfo getuserInfoOne(@PathVariable int userno) {
		return us.selectuserInfoOne(userno);
	}
	
	@PostMapping(value="/uis")
	public @ResponseBody Map<String,String> registerUserInfo(@RequestBody UserInfo ui) {
		Map<String,String> rMap = new HashMap<String,String>();
		return us.registerUserInfo(ui,rMap);
	}
	
	@PutMapping(value="/uis/{userno}")
	public @ResponseBody int updateuserInfo(@RequestBody UserInfo ui,@PathVariable int userno) {
		ui.setUserno(userno);
		return us.updateuserInfo(ui);
	}
	
	@GetMapping(value="/uis/check/{userid}")
	public @ResponseBody Map<String,String> idCheck(@PathVariable String userid){
		Map<String,String> rMap = new HashMap<String,String>();
		us.idcheck(userid, rMap);
		return rMap;
	}
	
	@PostMapping(value="/uis/login")
	public @ResponseBody Map<String,String> login(@RequestBody UserInfo ui,HttpServletRequest req){
		Map<String,String> rMap = new HashMap<String,String>();
		us.login(ui, rMap,req);
		return rMap;
	}
	
	@GetMapping(value="/uis/logout")
	public String Logout(HttpServletRequest req, HttpSession session) {
		session = req.getSession();
		session.invalidate();
		return "login/login-register";
	}
	
	@GetMapping(value="/uis/midcheck/{userid}")
	public @ResponseBody Map<String,String> midcheck(@PathVariable String userid,HttpServletRequest req){
		Map<String,String> rMap = new HashMap<String,String>();
		us.midcheck(userid, rMap, req);
		return rMap;
	}
	
	@GetMapping(value="/uis/mail")
	public @ResponseBody Map<String,String> mailcheck(@RequestParam("useremail") String useremail
			, HttpServletRequest req, HttpSession session){
		session = req.getSession(false);
		System.out.println(session.getAttribute("userid"));
		System.out.print(useremail);
		Map<String,String> rMap = new HashMap<String,String>();
		us.emailcheck(useremail, rMap, session);
		return rMap;
	}
	
		
	@GetMapping(value="/uis/session")
	public @ResponseBody Map<String,String> sessioncheck(HttpServletRequest req, HttpSession session){
		session = req.getSession(false);
		Map<String,String> rMap = new HashMap<String,String>();
		us.sessioncheck(rMap,session);
		return rMap;
	}
	
	@GetMapping(value="/uis/emailcheck")
	public @ResponseBody Map<String,String> userEmailCheck(@RequestParam("email") String useremail){
		Map<String,String> rMap = new HashMap<String,String>();
		us.userEmailCheck(useremail, rMap);
		return rMap;
	}
}
