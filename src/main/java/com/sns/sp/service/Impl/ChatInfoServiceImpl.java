<<<<<<< HEAD
package com.sns.sp.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.sp.dao.ChatInfoDAO;
import com.sns.sp.service.ChatInfoService;
import com.sns.sp.vo.ChatInfo;

@Service
public class ChatInfoServiceImpl implements ChatInfoService {

	@Autowired
	private ChatInfoDAO cidao;
	
	@Override
	public List<ChatInfo> selectchatInfoList() {
		return cidao.selectchatInfoList();
	}

	@Override
	public Integer insertchatInfo(ChatInfo ci) {
		return cidao.insertchatInfo(ci);
	}

	@Override
	public Integer updatechatInfo(ChatInfo ci) {
		return cidao.updatechatInfo(ci);
	}

	@Override
	public Integer deletechatInfo(int chatno) {
		return cidao.deletechatInfo(chatno);
	}

}
=======
package com.sns.sp.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.sp.dao.ChatInfoDAO;
import com.sns.sp.service.ChatInfoService;
import com.sns.sp.vo.ChatInfo;

@Service
public class ChatInfoServiceImpl implements ChatInfoService {

	@Autowired
	private ChatInfoDAO cidao;
	
	@Override
	public List<ChatInfo> selectchatInfoList() {
		return cidao.selectchatInfoList();
	}

	@Override
	public Integer insertchatInfo(ChatInfo ci) {
		return cidao.insertchatInfo(ci);
	}

	@Override
	public Integer updatechatInfo(ChatInfo ci) {
		return cidao.updatechatInfo(ci);
	}

	@Override
	public Integer deletechatInfo(int chatno) {
		return cidao.deletechatInfo(chatno);
	}

}
>>>>>>> branch 'master' of https://github.com/gusqls722/project-sns.git
