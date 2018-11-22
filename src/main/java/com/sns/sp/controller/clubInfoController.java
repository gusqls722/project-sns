package com.sns.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sns.sp.service.clubInfoService;
import com.sns.sp.vo.clubInfo;

@Controller
public class clubInfoController {

	@Autowired
	private clubInfoService cis;
	
	public @ResponseBody List<clubInfo> getclubInfoList(@ModelAttribute clubInfo c){
		return cis.selectclubInfoList();
	}
	
	@PostMapping(value="/cis")
	public @ResponseBody Integer insertclubInfo(@RequestBody clubInfo ci){
		return cis.insertclubInfo(ci);
	}
	
	@PutMapping(value="/cis/{chatno}")
	public @ResponseBody Integer updateclubInfo(@RequestBody clubInfo ci, @PathVariable int clubno){
		ci.setClubno(clubno);
		return cis.updateclubInfo(ci);
	}
	
	@DeleteMapping(value="/cis/{chatno}")
	public @ResponseBody Integer deleteclubInfo(@PathVariable int chatno){
		return cis.deleteclubInfo(chatno);
	}
}
