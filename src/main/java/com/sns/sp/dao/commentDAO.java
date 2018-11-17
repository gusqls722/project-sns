package com.sns.sp.dao;

import java.util.List;

import com.sns.sp.vo.comment;

public interface commentDAO {
	
	public List<comment> selectcommentList();
	public Integer insertcomment(comment c);
	public Integer updatecomment(comment c);
	public Integer deletecomment(int commentno);
}
