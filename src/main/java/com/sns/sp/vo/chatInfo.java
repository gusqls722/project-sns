package com.sns.sp.vo;

import org.apache.ibatis.type.Alias;

@Alias("chatInfo")
public class chatInfo {

	private Integer chatno;		
	private String userid;
	private String friendid;
	private String chattext;
	private String chatdat;		// date
	private Integer chatchecked;
	public Integer getChatno() {
		return chatno;
	}
	public void setChatno(Integer chatno) {
		this.chatno = chatno;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getFriendid() {
		return friendid;
	}
	public void setFriendid(String friendid) {
		this.friendid = friendid;
	}
	public String getChattext() {
		return chattext;
	}
	public void setChattext(String chattext) {
		this.chattext = chattext;
	}
	public String getChatdat() {
		return chatdat;
	}
	public void setChatdat(String chatdat) {
		this.chatdat = chatdat;
	}
	public Integer getChatchecked() {
		return chatchecked;
	}
	public void setChatchecked(Integer chatchecked) {
		this.chatchecked = chatchecked;
	}
	@Override
	public String toString() {
		return "chatInfo [chatno=" + chatno + ", userid=" + userid + ", friendid=" + friendid + ", chattext=" + chattext
				+ ", chatdat=" + chatdat + ", chatchecked=" + chatchecked + "]";
	} 
	
	
}

