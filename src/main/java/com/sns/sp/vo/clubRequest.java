package com.sns.sp.vo;

public class clubRequest {

	private Integer clubreqno;
	private Integer clubno;
	private String userid;
	private String acceptdat; 
	private String requestdat;
	private Integer status;
	public Integer getClubreqno() {
		return clubreqno;
	}
	public void setClubreqno(Integer clubreqno) {
		this.clubreqno = clubreqno;
	}
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
	public String getAcceptdat() {
		return acceptdat;
	}
	public void setAcceptdat(String acceptdat) {
		this.acceptdat = acceptdat;
	}
	public String getRequestdat() {
		return requestdat;
	}
	public void setRequestdat(String requestdat) {
		this.requestdat = requestdat;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "clubRequest [clubreqno=" + clubreqno + ", clubno=" + clubno + ", userid=" + userid + ", acceptdat="
				+ acceptdat + ", requestdat=" + requestdat + ", status=" + status + "]";
	} 
	
	
	
}
