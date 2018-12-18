package com.sns.sp.dao;

import java.util.List;

import com.sns.sp.vo.ClubInfo;
import com.sns.sp.vo.UserInfo;

public interface ClubUserDAO {

	public Integer insertclubUser(ClubInfo clubinfo);
	
	
	
	public List<Integer> affiliatedClub(String userid);
	
	public Integer joinClub(UserInfo userInfo);
	public Integer duplicationJoin(UserInfo userinfo);
}
