package com.sns.sp.vo;

import org.apache.ibatis.type.Alias;

@Alias("comment")
public class comment {

	private Integer boardno;
	private Integer userno;
	private String commenttext;
	private Integer commentlike;
	private String commentcredat;  // date
	public Integer getBoardno() {
		return boardno;
	}
	public void setBoardno(Integer boardno) {
		this.boardno = boardno;
	}
	public Integer getUserno() {
		return userno;
	}
	public void setUserno(Integer userno) {
		this.userno = userno;
	}
	public String getCommenttext() {
		return commenttext;
	}
	public void setCommenttext(String commenttext) {
		this.commenttext = commenttext;
	}
	public Integer getCommentlike() {
		return commentlike;
	}
	public void setCommentlike(Integer commentlike) {
		this.commentlike = commentlike;
	}
	public String getCommentcredat() {
		return commentcredat;
	}
	public void setCommentcredat(String commentcredat) {
		this.commentcredat = commentcredat;
	}
	@Override
	public String toString() {
		return "comment [boardno=" + boardno + ", userno=" + userno + ", commenttext=" + commenttext + ", commentlike="
				+ commentlike + ", commentcredat=" + commentcredat + "]";
	}
	
}
