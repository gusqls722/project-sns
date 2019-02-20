package com.sns.sp.dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sns.sp.dao.BoardLikeUserDAO;
import com.sns.sp.vo.BoardLikeUser;

@Repository
public class BoardLikeUserDAOImpl implements BoardLikeUserDAO {

	@Autowired
	private SqlSession ss;

	@Override
	public List<BoardLikeUser> selectboardLikeUserList() {
		return ss.selectList("com.sns.sp.BOARDLIKEUSER.BOARDLIKEUSERLIST");
	}

	@Override
	public Integer insertboardLikeUser(BoardLikeUser blu) {
		return ss.insert("com.sns.sp.BOARDLIKEUSER.insertBOARDLIKEUSER", blu);
	}

	@Override
	public Integer updateboardLikeUser(BoardLikeUser blu) {
		return ss.update("com.sns.sp.BOARDLIKEUSER.updateBOARDLIKEUSER", blu);
	}

	@Override
	public Integer deleteboardLikeUser(int boardno) {
		return ss.delete("com.sns.sp.BOARDLIKEUSER.deleteBOARDLIKEUSER", boardno);
	}

}
