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

import com.sns.sp.service.ClubRequestService;
import com.sns.sp.vo.ClubRequest;

@Controller
public class ClubRequestController {

	@Autowired
	private ClubRequestService crs;
	
	@GetMapping(value="/crs")
	public @ResponseBody List<ClubRequest> getclubRequestList(@ModelAttribute ClubRequest cr){
		return crs.selectclubRequestList();
	}
	
	@PostMapping(value="/crs")
	public @ResponseBody Integer insertclubRequest(@RequestBody ClubRequest cr){
		return crs.insertclubRequest(cr);
	}
	
	@PutMapping(value="/crs/{clubreqno}")
	public @ResponseBody Integer updateclubRequest(@RequestBody ClubRequest cr, @PathVariable int clubreqno){
		cr.setClubreqno(clubreqno);
		return crs.updateclubRequest(cr);
	}
	
	@DeleteMapping(value="/crs/{clubreqno}")
	public @ResponseBody Integer deleteclubRequest(@PathVariable int clubreqno){
		return crs.deleteclubRequest(clubreqno);
	}
}
