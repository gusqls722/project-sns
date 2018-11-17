package com.sns.sp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sns.sp.service.userInfoService;
import com.sns.sp.vo.userInfo;

@Controller
public class userInfoController {

	@Autowired
	private userInfoService us;
	
	@GetMapping(value="/uis")
	public @ResponseBody List<userInfo> getuserInfoList(@ModelAttribute userInfo ui){
		return us.selectuserInfoList();
	}
	
	@GetMapping(value="/uis/{userno}")
	public @ResponseBody userInfo getuserInfoOne(@PathVariable int userno) {
		return us.selectuserInfoOne(userno);
	}
	
	@PostMapping(value="/uis")
	public @ResponseBody Map<String,String> inseruserInfo(@RequestBody userInfo ui) {
		Map<String,String> rMap = new HashMap<String,String>();
		us.insertuserInfo(ui, rMap);
		return rMap;
	}
	
	@PutMapping(value="/uis/{userno}")
	public @ResponseBody int updateuserInfo(@RequestBody userInfo ui,@PathVariable int userno) {
		ui.setUserno(userno);
		return us.updateuserInfo(ui);
	}
}
