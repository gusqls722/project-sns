package com.sns.sp.dao;

import java.util.List;

import com.sns.sp.vo.ClubInfo;
import com.sns.sp.vo.ClubUser;

public interface ClubUserDAO {

	public Integer insertclubUser(ClubInfo ci);
	
	
	
	public List<Integer> affiliatedClub(String userid);
}
