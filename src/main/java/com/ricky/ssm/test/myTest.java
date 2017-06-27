package com.ricky.ssm.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ricky.ssm.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations=("classpath:applicationContext.xml"))
public class myTest {
	@Resource(name="userServiceImpl")
	private IUserService userService;
	
//	@Test
//	public void test(){
//		userService.add();
//	}
//	@Test
//	public void test2(){
//		System.out.println(userService.getUserById());
//	}
	@Test
	public void test3(){
		System.out.println(userService.getAllUser());
	}
}
