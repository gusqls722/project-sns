package com.sns.sp.service;

import java.util.Map;

import javax.servlet.http.HttpSession;

public interface ClubUserService {

	public Map<String, String> joinClub(HttpSession hs, Map<String, String> rMap);

	public Map<String, String> absentClub(HttpSession hs, Map<String, String> rMap);
}
