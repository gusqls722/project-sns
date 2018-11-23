package com.sns.sp.dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sns.sp.dao.ClubRequestDAO;
import com.sns.sp.vo.ClubRequest;
import com.sns.sp.vo.ClubRequest;

@Repository
public class ClubRequestDAOImpl implements ClubRequestDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<ClubRequest> selectclubRequestList() {
		return ss.selectList("com.sns.sp.CLUBREQUEST.CLUBREQUESTLIST");
	}

	@Override
	public Integer insertclubRequest(ClubRequest cr) {
		return ss.insert("com.sns.sp.CLUBREQUEST.insertCLUBREQUEST",cr);
	}

	@Override
	public Integer updateclubRequest(ClubRequest cr) {
		return ss.update("com.sns.sp.CLUBREQUEST.updateCLUBREQUEST",cr);
	}

	@Override
	public Integer deleteclubRequest(int clubreqno) {
		return ss.delete("com.sns.sp.CLUBREQUEST.deleteCLUBREQUEST",clubreqno);
	}
}
