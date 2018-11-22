package com.sns.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sns.sp.service.chatInfoService;
import com.sns.sp.vo.chatInfo;

@Controller
public class chatInfoController {

	@Autowired
	private chatInfoService cis;
	
	@GetMapping(value="/chats")
	public @ResponseBody List<chatInfo> getchatInfoList(@ModelAttribute chatInfo c){
		return cis.selectchatInfoList();
	}
	
	@PostMapping(value="/chats")
	public @ResponseBody Integer insertchatInfo(@RequestBody chatInfo ci){
		return cis.insertchatInfo(ci);
	}
	
	@PutMapping(value="/chats/{chatno}")
	public @ResponseBody Integer updatechatInfo(@RequestBody chatInfo ci, @PathVariable int chatno){
		ci.setChatno(chatno);
		return cis.updatechatInfo(ci);
	}
	
	@DeleteMapping(value="/chats/{chatno}")
	public @ResponseBody Integer deletechatInfo(@PathVariable int chatno){
		return cis.deletechatInfo(chatno);
	}
}
