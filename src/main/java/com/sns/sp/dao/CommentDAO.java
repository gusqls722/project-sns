package com.sns.sp.dao;

import java.util.List;

import com.sns.sp.vo.Comment;

public interface CommentDAO {

	public List<Comment> selectcommentList();

	public Integer insertcomment(Comment c);

	public Integer updatecomment(Comment c);

	public Integer deletecomment(int commentno);
}
