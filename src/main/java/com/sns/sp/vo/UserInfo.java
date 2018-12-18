package com.sns.sp.vo;

import org.apache.ibatis.type.Alias;

@Alias("userInfo")
public class UserInfo {

	private Integer userno;
	private String userid;
	private String userpwd;
	private String username;
	private String useremail;
	private String userbirth;
	private String usergender;
	private String usercategory;
	private String userdesc;
	private ClubInfo clubInfo;
	
	public ClubInfo getClubInfo() {
		return clubInfo;
	}
	public void setClubInfo(ClubInfo clubInfo) {
		this.clubInfo = clubInfo;
	}
	public Integer getUserno() {
		return userno;
	}
	public void setUserno(Integer userno) {
		this.userno = userno;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUserbirth() {
		return userbirth;
	}
	public void setUserbirth(String userbirth) {
		this.userbirth = userbirth;
	}
	public String getUsergender() {
		return usergender;
	}
	public void setUsergender(String usergender) {
		this.usergender = usergender;
	}
	public String getUsercategory() {
		return usercategory;
	}
	public void setUsercategory(String usercategory) {
		this.usercategory = usercategory;
	}
	public String getUserdesc() {
		return userdesc;
	}
	public void setUserdesc(String userdesc) {
		this.userdesc = userdesc;
	}
	
	@Override
	public String toString() {
		return "UserInfo [userno=" + userno + ", userid=" + userid + ", userpwd=" + userpwd + ", username=" + username
				+ ", useremail=" + useremail + ", userbirth=" + userbirth + ", usergender=" + usergender
				+ ", usercategory=" + usercategory + ", userdesc=" + userdesc + "]";
	}
	
	
}
