package com.sns.sp.service;

import java.util.List;

import com.sns.sp.vo.boardLikeUser;

public interface boardLikeUserService {

	public List<boardLikeUser> selectboardLikeUserList();
	public Integer insertboardLikeUser(boardLikeUser ci);
	public Integer updateboardLikeUser(boardLikeUser ci);
	public Integer deleteboardLikeUser(int boardno);
}
