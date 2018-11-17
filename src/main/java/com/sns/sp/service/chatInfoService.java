package com.sns.sp.service;

import java.util.List;

import com.sns.sp.vo.chatInfo;

public interface chatInfoService {

	public List<chatInfo> selectchatInfoList();
	public Integer insertchatInfo(chatInfo ci);
	public Integer updatechatInfo(chatInfo ci);
	public Integer deletechatInfo(int chatno);
}
