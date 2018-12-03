package com.sns.sp.service;

import java.util.List;
import java.util.Map;

import com.sns.sp.vo.ClubInfo;

public interface ClubInfoService {

	public List<ClubInfo> selectclubInfoList();
	public List<ClubInfo> selectclubInfoListTop();
	public ClubInfo selectclubInfoOne(int cino);
	public Map<String,String> insertclubInfo(ClubInfo ci, Map<String,String> rMap);
	public Integer updateclubInfo(ClubInfo ci);
	public Integer deleteclubInfo(int cino);
}
