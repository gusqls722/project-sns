package com.sns.sp.vo;

import org.apache.ibatis.type.Alias;

@Alias("userInfo")
public class userInfo {

	private Integer userno;
	private String userid;
	private String userpwd;
	private String username;
	private String useremail;
	private String userbirth;
	private Integer usergender;
	
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
	public Integer getUsergender() {
		return usergender;
	}
	public void setUsergender(Integer usergender) {
		this.usergender = usergender;
	}
	@Override
	public String toString() {
		return "userInfo [userno=" + userno + ", userid=" + userid + ", userpwd=" + userpwd + ", username=" + username
				+ ", useremail=" + useremail + ", userbirth=" + userbirth + ", usergender=" + usergender + "]";
	}
	
	
}
