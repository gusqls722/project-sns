package com.sns.sp.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.sp.dao.commentDAO;
import com.sns.sp.service.commentService;
import com.sns.sp.vo.comment;

@Service
public class commentServiceImpl implements commentService {

	@Autowired
	private commentDAO cdao;
	
	@Override
	public List<comment> selectcommentList() {
		return cdao.selectcommentList();
	}

	@Override
	public Integer insertcomment(comment c) {
		return cdao.insertcomment(c);
	}

	@Override
	public Integer updatecomment(comment c) {
		return cdao.updatecomment(c);
	}

	@Override
	public Integer deletecomment(int commentno) {
		return cdao.deletecomment(commentno);
	}

}
