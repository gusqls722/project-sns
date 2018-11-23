package com.sns.sp.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.sp.dao.BoardLikeUserDAO;
import com.sns.sp.service.BoardLikeUserService;
import com.sns.sp.vo.BoardLikeUser;
import com.sns.sp.vo.BoardLikeUser;

@Service
public class BoardLikeUserServiceImpl implements BoardLikeUserService {

	@Autowired
	private BoardLikeUserDAO bludao;
	
	@Override
	public List<BoardLikeUser> selectboardLikeUserList() {
		return bludao.selectboardLikeUserList();
	}

	@Override
	public Integer insertboardLikeUser(BoardLikeUser blu) {
		return bludao.insertboardLikeUser(blu);
	}

	@Override
	public Integer updateboardLikeUser(BoardLikeUser blu) {
		return bludao.updateboardLikeUser(blu);
	}

	@Override
	public Integer deleteboardLikeUser(int boardno) {
		return bludao.deleteboardLikeUser(boardno);
	}

}

