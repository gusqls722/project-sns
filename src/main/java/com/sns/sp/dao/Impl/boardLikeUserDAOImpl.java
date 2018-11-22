package com.sns.sp.dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sns.sp.dao.boardListUserDAO;
import com.sns.sp.vo.boardLikeUser;
import com.sns.sp.vo.boardLikeUser;

@Repository
public class boardLikeUserDAOImpl implements boardListUserDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<boardLikeUser> selectboardLikeUserList() {
		return ss.selectList("com.sns.sp.BOARDLIKEUSER.BOARDLIKEUSERLIST");
	}

	@Override
	public Integer insertboardLikeUser(boardLikeUser blu) {
		return ss.insert("com.sns.sp.BOARDLIKEUSER.insertBOARDLIKEUSER",blu);
	}

	@Override
	public Integer updateboardLikeUser(boardLikeUser blu) {
		return ss.update("com.sns.sp.BOARDLIKEUSER.updateBOARDLIKEUSER",blu);
	}

	@Override
	public Integer deleteboardLikeUser(int boardno) {
		return ss.delete("com.sns.sp.BOARDLIKEUSER.deleteBOARDLIKEUSER",boardno);
	}

}
