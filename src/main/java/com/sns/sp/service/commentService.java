package com.sns.sp.service;

import java.util.List;

import com.sns.sp.vo.comment;

public interface commentService {

	public List<comment> selectcommentList();
	public Integer insertcomment(comment c);
	public Integer updatecomment(comment c);
	public Integer deletecomment(int commentno);
}
