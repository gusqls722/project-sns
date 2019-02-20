package com.sns.sp.service;

import java.util.List;

import com.sns.sp.vo.BoardLikeUser;

public interface BoardLikeUserService {

	public List<BoardLikeUser> selectboardLikeUserList();

	public Integer insertboardLikeUser(BoardLikeUser ci);

	public Integer updateboardLikeUser(BoardLikeUser ci);

	public Integer deleteboardLikeUser(int boardno);
}
