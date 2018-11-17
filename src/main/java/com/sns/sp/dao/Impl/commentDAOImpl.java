package com.sns.sp.dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sns.sp.dao.commentDAO;
import com.sns.sp.vo.comment;

@Repository
public class commentDAOImpl implements commentDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<comment> selectcommentList() {
		return ss.selectList("com.sns.sp.COMMENT.COMMENTLIST");
	}

	@Override
	public Integer insertcomment(comment c) {
		return ss.insert("com.sns.sp.COMMENT.insertCOMMENT");
	}

	@Override
	public Integer updatecomment(comment c) {
		return ss.update("com.sns.sp.COMMENT.updateCOMMENT");
	}

	@Override
	public Integer deletecomment(int commentno) {
		return ss.delete("com.sns.sp.COMMENT.deleteCOMMENT");
	}

}
