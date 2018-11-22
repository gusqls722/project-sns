package com.sns.sp.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.sp.dao.boardLikeUserDAO;
import com.sns.sp.service.boardLikeUserService;
import com.sns.sp.vo.boardLikeUser;
import com.sns.sp.vo.boardLikeUser;

@Service
public class boardLikeUserServiceImpl implements boardLikeUserService {

	@Autowired
	private boardLikeUserDAO bludao;
	
	@Override
	public List<boardLikeUser> selectboardLikeUserList() {
		return bludao.selectboardLikeUserList();
	}

	@Override
	public Integer insertboardLikeUser(boardLikeUser blu) {
		return bludao.insertboardLikeUser(blu);
	}

	@Override
	public Integer updateboardLikeUser(boardLikeUser blu) {
		return bludao.updateboardLikeUser(blu);
	}

	@Override
	public Integer deleteboardLikeUser(int boardno) {
		return bludao.deleteboardLikeUser(boardno);
	}

}

