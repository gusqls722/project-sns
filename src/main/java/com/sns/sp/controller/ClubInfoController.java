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

import com.sns.sp.service.ClubInfoService;
import com.sns.sp.vo.ClubInfo;

@Controller
public class ClubInfoController {

	@Autowired
	private ClubInfoService cis;
	
	@GetMapping(value="/cis")
	public @ResponseBody List<ClubInfo> getclubInfoList(@ModelAttribute ClubInfo c){
		return cis.selectclubInfoList();
	}
	
	@PostMapping(value="/cis")
	public @ResponseBody Integer insertclubInfo(@RequestBody ClubInfo ci){
		return cis.insertclubInfo(ci);
	}
	
	@PutMapping(value="/cis/{chatno}")
	public @ResponseBody Integer updateclubInfo(@RequestBody ClubInfo ci, @PathVariable int clubno){
		ci.setClubno(clubno);
		return cis.updateclubInfo(ci);
	}
	
	@DeleteMapping(value="/cis/{chatno}")
	public @ResponseBody Integer deleteclubInfo(@PathVariable int chatno){
		return cis.deleteclubInfo(chatno);
	}
}
