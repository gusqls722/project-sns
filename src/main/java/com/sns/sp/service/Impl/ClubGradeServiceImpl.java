package com.sns.sp.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.sp.dao.ClubGradeDAO;
import com.sns.sp.service.ClubGradeService;
import com.sns.sp.vo.ClubInfo;

@Service
public class ClubGradeServiceImpl implements ClubGradeService {

	@Autowired
	private ClubGradeDAO cgdao;

}
