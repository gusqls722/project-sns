package com.sns.sp.dao;

import java.util.List;

import com.sns.sp.vo.chatInfo;

public interface chatInfoDAO {

	public List<chatInfo> selectchatInfoList();
	public Integer insertchatInfo(chatInfo ci);
	public Integer updatechatInfo(chatInfo ci);
	public Integer deletechatInfo(int chatno);
}
