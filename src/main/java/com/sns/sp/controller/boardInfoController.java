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

import com.sns.sp.service.boardInfoService;
import com.sns.sp.vo.boardInfo;

@Controller
public class boardInfoController {

	@Autowired
	private boardInfoService bs;
	
	@GetMapping(value="/bis")
	public @ResponseBody List<boardInfo> getboardInfoList(@ModelAttribute boardInfo bi){
		return bs.selectboardInfoList();
	}
	
	@GetMapping(value="/bis/{boardno}")
	public @ResponseBody boardInfo getboardInfoOne(@PathVariable int boardno) {
		return bs.selectboardInfoOne(boardno);
	}
	
	@PostMapping(value="/bis")
	public @ResponseBody Integer insertboardInfo(@RequestBody boardInfo bi) {
		return bs.insertboardInfo(bi);
	}
	
	@PutMapping(value="/bis/{boardno}")
	public @ResponseBody Integer updateboardInfo(@RequestBody boardInfo bi, @PathVariable int boardno) {
		bi.setBoardno(boardno);
		return bs.updateboardInfo(bi);
	}
	
	@DeleteMapping(value="/bis/{boardno}")
	public @ResponseBody Integer deleteboardInfo(@PathVariable int boardno) {
		return bs.deleteboardInfo(boardno);
	}
}
