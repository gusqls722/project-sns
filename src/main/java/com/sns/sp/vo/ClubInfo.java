package com.sns.sp.vo;

import org.apache.ibatis.type.Alias;

@Alias("clubInfo")
public class ClubInfo {

	private Integer clubno;
	private String clubname;
	private String clubdesc;
	private String userid;
	private Integer clubUC;
	private String clubimage;
	private String clubcredat;
	public Integer getClubno() {
		return clubno;
	}
	public void setClubno(Integer clubno) {
		this.clubno = clubno;
	}
	public String getClubname() {
		return clubname;
	}
	public void setClubname(String clubname) {
		this.clubname = clubname;
	}
	public String getClubdesc() {
		return clubdesc;
	}
	public void setClubdesc(String clubdesc) {
		this.clubdesc = clubdesc;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Integer getClubUC() {
		return clubUC;
	}
	public void setClubUC(Integer clubUC) {
		this.clubUC = clubUC;
	}
	public String getClubimage() {
		return clubimage;
	}
	public void setClubimage(String clubimage) {
		this.clubimage = clubimage;
	}
	public String getClubcredat() {
		return clubcredat;
	}
	public void setClubcredat(String clubcredat) {
		this.clubcredat = clubcredat;
	}
	@Override
	public String toString() {
		return "ClubInfo [clubno=" + clubno + ", clubname=" + clubname + ", clubdesc=" + clubdesc + ", userid=" + userid
				+ ", clubUC=" + clubUC + ", clubimage=" + clubimage + ", clubcredat=" + clubcredat + "]";
	}
	
	
}
