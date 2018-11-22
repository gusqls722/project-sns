package com.sns.sp.dao;

import java.util.List;

import com.sns.sp.vo.boardLikeUser;

public interface boardListUserDAO {

	public List<boardLikeUser> selectboardLikeUserList();
	public Integer insertboardLikeUser(boardLikeUser ci);
	public Integer updateboardLikeUser(boardLikeUser ci);
	public Integer deleteboardLikeUser(int boardno);
}
