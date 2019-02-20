package com.sns.sp.dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sns.sp.dao.CommentDAO;
import com.sns.sp.vo.Comment;

@Repository
public class CommentDAOImpl implements CommentDAO {

	@Autowired
	private SqlSession ss;

	@Override
	public List<Comment> selectcommentList() {
		return ss.selectList("com.sns.sp.COMMENT.COMMENTLIST");
	}

	@Override
	public Integer insertcomment(Comment c) {
		return ss.insert("com.sns.sp.COMMENT.insertCOMMENT", c);
	}

	@Override
	public Integer updatecomment(Comment c) {
		return ss.update("com.sns.sp.COMMENT.updateCOMMENT", c);
	}

	@Override
	public Integer deletecomment(int commentno) {
		return ss.delete("com.sns.sp.COMMENT.deleteCOMMENT", commentno);
	}

}
