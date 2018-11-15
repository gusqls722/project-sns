package com.sns.sp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sns.sp.dao.userInfoDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class daoTest {

	@Autowired
	private userInfoDAO udao;
	
	@Test
	public void test() {
		assertEquals(2,udao.selectuserInfoList().size());
		
	}
	
}
