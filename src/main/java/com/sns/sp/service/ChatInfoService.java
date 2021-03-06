package com.sns.sp.service;

import java.util.List;

import com.sns.sp.vo.ChatInfo;

public interface ChatInfoService {

	public List<ChatInfo> selectchatInfoList();

	public Integer insertchatInfo(ChatInfo ci);

	public Integer updatechatInfo(ChatInfo ci);

	public Integer deletechatInfo(int chatno);
}
