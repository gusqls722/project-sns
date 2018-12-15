package com.sns.sp.vo;

import org.apache.ibatis.type.Alias;

@Alias("clubGrade")
public class Clubgarde {

	public Integer clubno;
	public String userid;
	public Integer usergarde;
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
	public Integer getUsergarde() {
		return usergarde;
	}
	public void setUsergarde(Integer usergarde) {
		this.usergarde = usergarde;
	}
	@Override
	public String toString() {
		return "Clubgarde [clubno=" + clubno + ", userid=" + userid + ", usergarde=" + usergarde + "]";
	}
	
	
}
