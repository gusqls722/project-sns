package com.sns.sp.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.sp.dao.chatInfoDAO;
import com.sns.sp.service.chatInfoService;
import com.sns.sp.vo.chatInfo;

@Service
public class chatInfoServiceImpl implements chatInfoService {

	@Autowired
	private chatInfoDAO cidao;
	
	@Override
	public List<chatInfo> selectchatInfoList() {
		return cidao.selectchatInfoList();
	}

	@Override
	public Integer insertchatInfo(chatInfo ci) {
		return cidao.insertchatInfo(ci);
	}

	@Override
	public Integer updatechatInfo(chatInfo ci) {
		return cidao.updatechatInfo(ci);
	}

	@Override
	public Integer deletechatInfo(int chatno) {
		return cidao.deletechatInfo(chatno);
	}

}
