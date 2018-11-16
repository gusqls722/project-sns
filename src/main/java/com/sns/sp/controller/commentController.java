package com.sns.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sns.sp.service.commentService;
import com.sns.sp.vo.comment;

@Controller
public class commentController {
	
	@Autowired
	private commentService cs; 
	
	@GetMapping(value="/cs")
	public @ResponseBody List<comment> getcommentList(@ModelAttribute comment c){
		return cs.selectcommentList();
	}
	
	@PostMapping(value="/cs")
	public @ResponseBody Integer insertcomment(@RequestBody comment c){
		return cs.insertcomment(c);
	}
	
	@PutMapping(value="/cs/{commentno}")
	public @ResponseBody Integer updatecomment(@RequestBody comment c, @PathVariable int commentno){
		c.setCommentno(commentno);
		return cs.updatecomment(c);
	}
}
