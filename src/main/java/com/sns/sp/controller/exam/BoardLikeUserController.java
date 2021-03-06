package com.sns.sp.controller.exam;

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

import com.sns.sp.service.BoardLikeUserService;
import com.sns.sp.vo.BoardLikeUser;

@Controller
public class BoardLikeUserController {

	@Autowired
	private BoardLikeUserService blus;
	
	@GetMapping(value="/blus")
	public @ResponseBody List<BoardLikeUser> getboardLikeUserList(@ModelAttribute BoardLikeUser blu){
		return blus.selectboardLikeUserList();
	}
	
	@PostMapping(value="/blus")
	public @ResponseBody Integer insertboardLikeUser(@RequestBody BoardLikeUser blu){
		return blus.insertboardLikeUser(blu);
	}
	
	@PutMapping(value="/blus/{boardno}")
	public @ResponseBody Integer updateboardLikeUser(@RequestBody BoardLikeUser blu, @PathVariable int boardno){
		blu.setBoardno(boardno);
		return blus.updateboardLikeUser(blu);
	}
	
	@DeleteMapping(value="/blus/{boardno}")
	public @ResponseBody Integer deleteboardLikeUser(@PathVariable int boardno){
		return blus.deleteboardLikeUser(boardno);
	}
}
