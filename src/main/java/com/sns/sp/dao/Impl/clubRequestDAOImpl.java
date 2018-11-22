package com.sns.sp.dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sns.sp.dao.clubRequestDAO;
import com.sns.sp.vo.clubRequest;
import com.sns.sp.vo.clubRequest;

@Repository
public class clubRequestDAOImpl implements clubRequestDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<clubRequest> selectclubRequestList() {
		return ss.selectList("com.sns.sp.CLUBREQUEST.CLUBREQUESTLIST");
	}

	@Override
	public Integer insertclubRequest(clubRequest cr) {
		return ss.insert("com.sns.sp.CLUBREQUEST.insertCLUBREQUEST",cr);
	}

	@Override
	public Integer updateclubRequest(clubRequest cr) {
		return ss.update("com.sns.sp.CLUBREQUEST.updateCLUBREQUEST",cr);
	}

	@Override
	public Integer deleteclubRequest(int clubreqno) {
		return ss.delete("com.sns.sp.CLUBREQUEST.deleteCLUBREQUEST",clubreqno);
	}

}
