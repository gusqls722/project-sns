package com.sns.sp.dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sns.sp.dao.ClubInfoDAO;
import com.sns.sp.vo.ClubInfo;

@Repository
public class ClubInfoDAOImpl implements ClubInfoDAO{

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<ClubInfo> setClubInfoList() {
		// TODO Auto-generated method stub
		return ss.selectList("com.sns.sp.CLUBINFO.CLUBINFOLIST");
	}

	@Override
	public ClubInfo setClubInfoOne(int clubno) {
		// TODO Auto-generated method stub
		return ss.selectOne("com.sns.sp.CLUBINFO.CLUBINFOONE");
	}

	@Override
	public Integer insertClubInfo(ClubInfo clubInfo) {
		// TODO Auto-generated method stub
		return ss.insert("com.sns.sp.CLUBINFO.INSERTCLUBINFO",clubInfo);
	}

	@Override
	public Integer updateClubInfo(ClubInfo clubInfo) {
		// TODO Auto-generated method stub
		return ss.update("com.sns.sp.CLUBINFO.UPDATECLUBINFO",clubInfo);
	}

	@Override
	public Integer deleteClubInfo(int clubno) {
		// TODO Auto-generated method stub
		return ss.delete("com.sns.sp.CLUBINFO.DELETECLUBINFO",clubno);
	}

	@Override
	public List<ClubInfo> myClub(String userid) {
		// TODO Auto-generated method stub
		return ss.selectList("com.sns.sp.CLUBINFO.myCLUB",userid);
	}

}
