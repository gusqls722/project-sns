package com.sns.sp.vo;

import org.apache.ibatis.type.Alias;

@Alias("clubUser")
public class ClubUser {

	private Integer clubno;
	private String userid;
	
	
	
	
	public Integer getClubno() {
		return clubno;
	}




	public void setClubno(Integer clubno) {
		this.clubno = clubno;
	}




	public String getUserid() {
		return userid;
	}




	public void setUserid(String userid) {
		this.userid = userid;
	}




	@Override
	public String toString() {
		return "ClubUser [clubno=" + clubno + ", userid=" + userid + "]";
	}
	
	
}
