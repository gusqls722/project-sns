package com.sns.sp.dao;

import java.util.List;

import com.sns.sp.vo.ChatInfo;

public interface ChatInfoDAO {

	public List<ChatInfo> selectchatInfoList();
	public Integer insertchatInfo(ChatInfo ci);
	public Integer updatechatInfo(ChatInfo ci);
	public Integer deletechatInfo(int chatno);
}
