package com.sns.sp.vo;

import org.apache.ibatis.type.Alias;

@Alias("boardLikeUser")
public class BoardLikeUser {

	private Integer boardno;
	private String userid;
	
	
	public Integer getBoardno() {
		return boardno;
	}


	public void setBoardno(Integer boardno) {
		this.boardno = boardno;
	}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	@Override
	public String toString() {
		return "boardLikeuser [boardno=" + boardno + ", userid=" + userid + "]";
	}
	
	
}
