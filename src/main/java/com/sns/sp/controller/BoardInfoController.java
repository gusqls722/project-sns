package com.sns.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sns.sp.service.BoardInfoService;
import com.sns.sp.vo.BoardInfo;

@Controller
public class BoardInfoController {

	@Autowired
	private BoardInfoService bis;
	
	@GetMapping("/boardinfos/main/popular")			// 메인화면의 인기있는 게시글 (좋아요 갯수로 가져옴)
	public @ResponseBody List<BoardInfo> popularBoardInfo(@ModelAttribute BoardInfo boardinfo){
		return bis.popularBoardInfo();
	}
}
