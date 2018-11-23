package com.sns.sp.service;

import java.util.List;

import com.sns.sp.vo.Comment;

public interface CommentService {

	public List<Comment> selectcommentList();
	public Integer insertcomment(Comment c);
	public Integer updatecomment(Comment c);
	public Integer deletecomment(int commentno);
}
