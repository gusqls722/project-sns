package com.sns.sp.vo;

import org.apache.ibatis.type.Alias;

@Alias("boardInfo")
public class BoardInfo {

	private Integer boardno;
	private String boardtext;
	private String boardfile;
	private Integer boardlikecount;
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
	public String getBoardfile() {
		return boardfile;
	}
	public void setBoardfile(String boardfile) {
		this.boardfile = boardfile;
	}
	public Integer getBoardlikecount() {
		return boardlikecount;
	}
	public void setBoardlikecount(Integer boardlikecount) {
		this.boardlikecount = boardlikecount;
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
		return "BoardInfo [boardno=" + boardno + ", boardtext=" + boardtext + ", boardfile=" + boardfile
				+ ", boardlikecount=" + boardlikecount + ", boardcommentcount=" + boardcommentcount + ", boardvisit="
				+ boardvisit + ", boardcredat=" + boardcredat + ", boardmoddat=" + boardmoddat + ", userno=" + userno
				+ ", clubno=" + clubno + "]";
	}
	
	
}
