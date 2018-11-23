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

import com.sns.sp.service.CommentService;
import com.sns.sp.vo.Comment;

@Controller
public class CommentController {
	
	@Autowired
	private CommentService cs; 
	
	@GetMapping(value="/cs")
	public @ResponseBody List<Comment> getcommentList(@ModelAttribute Comment c){
		return cs.selectcommentList();
	}
	
	@PostMapping(value="/cs")
	public @ResponseBody Integer insertcomment(@RequestBody Comment c){
		return cs.insertcomment(c);
	}
	
	@PutMapping(value="/cs/{commentno}")
	public @ResponseBody Integer updatecomment(@RequestBody Comment c, @PathVariable int commentno){
		c.setCommentno(commentno);
		return cs.updatecomment(c);
	}
	
	@DeleteMapping(value="/cs/{commentno}")
	public @ResponseBody Integer deletecomment(@PathVariable int commentno){
		return cs.deletecomment(commentno);
	}
}
