package com.sns.sp.dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sns.sp.dao.ClubInfoDAO;
import com.sns.sp.vo.ClubInfo;

@Repository
public class ClubInfoDAOImpl implements ClubInfoDAO {

	@Autowired
	private SqlSession ss;

	@Override
	public List<ClubInfo> selectClubInfoList() {
		return ss.selectList("com.sns.sp.CLUBINFO.CLUBINFOLIST");
	}

	@Override
	public ClubInfo selectClubInfoOne(int clubno) {
		return ss.selectOne("com.sns.sp.CLUBINFO.CLUBINFOONE", clubno);
	}

	@Override
	public Integer insertClubInfo(ClubInfo clubInfo) {
		return ss.insert("com.sns.sp.CLUBINFO.INSERTCLUBINFO", clubInfo);
	}

	@Override
	public Integer updateClubInfo(ClubInfo clubInfo) {
		return ss.update("com.sns.sp.CLUBINFO.UPDATECLUBINFO", clubInfo);
	}

	@Override
	public Integer deleteClubInfo(int clubno) {
		return ss.delete("com.sns.sp.CLUBINFO.DELETECLUBINFO", clubno);
	}

	@Override
	public ClubInfo myClub(int clubno) {
		return ss.selectOne("com.sns.sp.CLUBINFO.MYCLUB", clubno);
	}

	@Override
	public Integer createClub(ClubInfo clubinfo) {
		System.out.println(clubinfo);
		System.out.println(clubinfo);
		System.out.println(clubinfo);
		return ss.insert("com.sns.sp.CLUBINFO.CREATECLUB", clubinfo);
	}

	@Override
	public ClubInfo JoinClub(int clubno) {
		return ss.selectOne("com.sns.sp.CLUBINFO.JOINCLUB", clubno);
	}

}
