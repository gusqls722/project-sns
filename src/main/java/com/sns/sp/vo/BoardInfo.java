package com.sns.sp.vo;

import org.apache.ibatis.type.Alias;

@Alias("boardInfo")
public class BoardInfo {

	private Integer boardno;
	private String boardtext;
	private String boardimage;
	private Integer boardlike;
	private Integer boardcommentcount;
	private Integer boardvisit;
	private String boardcredat;		// date     
	private String boardmoddat;	// date
	private Integer userno;
	private Integer clubno;
	public Integer getBoardno() {
		return boardno;
	}
	public void setBoardno(Integer boardno) {
		this.boardno = boardno;
	}
	public String getBoardtext() {
		return boardtext;
	}
	public void setBoardtext(String boardtext) {
		this.boardtext = boardtext;
	}
	public String getBoardimage() {
		return boardimage;
	}
	public void setBoardimage(String boardimage) {
		this.boardimage = boardimage;
	}
	public Integer getBoardlike() {
		return boardlike;
	}
	public void setBoardlike(Integer boardlike) {
		this.boardlike = boardlike;
	}
	public Integer getBoardcommentcount() {
		return boardcommentcount;
	}
	public void setBoardcommentcount(Integer boardcommentcount) {
		this.boardcommentcount = boardcommentcount;
	}
	public Integer getBoardvisit() {
		return boardvisit;
	}
	public void setBoardvisit(Integer boardvisit) {
		this.boardvisit = boardvisit;
	}
	public String getBoardcredat() {
		return boardcredat;
	}
	public void setBoardcredat(String boardcredat) {
		this.boardcredat = boardcredat;
	}
	public String getBoardmoddat() {
		return boardmoddat;
	}
	public void setBoardmoddat(String boardmoddat) {
		this.boardmoddat = boardmoddat;
	}
	public Integer getUserno() {
		return userno;
	}
	public void setUserno(Integer userno) {
		this.userno = userno;
	}
	public Integer getClubno() {
		return clubno;
	}
	public void setClubno(Integer clubno) {
		this.clubno = clubno;
	}
	@Override
	public String toString() {
		return "boardInfo [boardno=" + boardno + ", boardtext=" + boardtext + ", boardimage=" + boardimage
				+ ", boardlike=" + boardlike + ", boardcommentcount=" + boardcommentcount + ", boardvisit=" + boardvisit
				+ ", boardcredat=" + boardcredat + ", boardmoddat=" + boardmoddat + ", userno=" + userno + ", clubno="
				+ clubno + "]";
	}	
}
