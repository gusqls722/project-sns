package com.sns.sp.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.sp.dao.CommentDAO;
import com.sns.sp.service.CommentService;
import com.sns.sp.vo.Comment;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentDAO cdao;
	
	@Override
	public List<Comment> selectcommentList() {
		return cdao.selectcommentList();
	}

	@Override
	public Integer insertcomment(Comment c) {
		return cdao.insertcomment(c);
	}

	@Override
	public Integer updatecomment(Comment c) {
		return cdao.updatecomment(c);
	}

	@Override
	public Integer deletecomment(int commentno) {
		return cdao.deletecomment(commentno);
	}

}
