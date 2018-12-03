package com.sns.sp.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.sp.dao.ClubInfoDAO;
import com.sns.sp.dao.ClubUserDAO;
import com.sns.sp.service.ClubInfoService;
import com.sns.sp.vo.ClubInfo;

@Service
public class ClubInfoServiceImpl implements ClubInfoService {

	@Autowired
	private ClubInfoDAO cidao;
	@Autowired
	private ClubUserDAO cudao;
	
	@Override
	public List<ClubInfo> selectclubInfoList() {
		
		return cidao.selectclubInfoList();
	}

	@Override
	public List<ClubInfo> selectclubInfoListTop() {
		return cidao.selectclubInfoListTop();
	}
	
	@Override
	public ClubInfo selectclubInfoOne(int cino) {
		return cidao.selectclubInfoOne(cino);
	}
	
	@Override
	public Map<String,String> insertclubInfo(ClubInfo ci, Map<String,String> rMap) {
		 rMap.put("reg", "fail");
		 rMap.put("msg", "클럽이 만들어지지 않았습니다.");
		 int rs = cidao.insertclubInfo(ci);
		 int rs2 = cudao.insertclubUser(ci);
		 if(rs==1 && rs2==1) {
			 rMap.put("reg", "fail");
			 rMap.put("msg", "클럽이 정상적으로 만들어졌습니다.");
			 
		 }
		 return rMap;
	}

	@Override
	public Integer updateclubInfo(ClubInfo ci) {
		return cidao.updateclubInfo(ci);
	}

	@Override
	public Integer deleteclubInfo(int cino) {
		return cidao.deleteclubInfo(cino);
	}

}
