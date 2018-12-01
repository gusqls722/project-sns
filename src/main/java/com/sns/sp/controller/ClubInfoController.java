package com.sns.sp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

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
import com.sns.sp.vo.UserInfo;

@Controller
public class ClubInfoController {

	@Autowired
	private ClubInfoService cis;
	
	@GetMapping(value="/cis")
	public @ResponseBody List<ClubInfo> getclubInfoList(@ModelAttribute ClubInfo c){
		
		return cis.selectclubInfoList();
	}
	
	@GetMapping(value="/cis/top5")
	public @ResponseBody List<ClubInfo> getclubInfoListTop5(@ModelAttribute ClubInfo c){
		return cis.selectclubInfoListTop();
	}
	
	@GetMapping("/cis/{cino}")
	public @ResponseBody ClubInfo getclubInfoOne(@PathVariable int cino){
		return cis.selectclubInfoOne(cino);			
	}
	
	@PostMapping(value="/cis")
	public @ResponseBody Integer insertclubInfo(@RequestBody ClubInfo ci,HttpSession hs){
		UserInfo uivo = (UserInfo) hs.getAttribute("user");
		ci.setUserid(uivo.getUserid());
		ci.setClubUC(1);
		return cis.insertclubInfo(ci);
	}
	
	@PutMapping(value="/cis/{clubno}")
	public @ResponseBody Integer updateclubInfo(@RequestBody ClubInfo ci, @PathVariable int cino){
		ci.setClubno(cino);
		return cis.updateclubInfo(ci);
	}
	
	@DeleteMapping(value="/cis/{clubno}")
	public @ResponseBody Integer deleteclubInfo(@PathVariable int cino){
		return cis.deleteclubInfo(cino);
	}
	

	
}
