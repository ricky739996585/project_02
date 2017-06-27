package com.ricky.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Transactional;

import com.ricky.ssm.model.User;
import com.ricky.ssm.dao.IUserDao;
import com.ricky.ssm.service.IUserService;
//@Transactional(rollbackFor=java.lang.Exception.class)
@Service("userServiceImpl")
public class IUserServiceImpl implements IUserService {
	@Resource(name="userDaoImpl")
	private IUserDao userDao;

	public void add() {
		User user = new User();
		user.setUserId(4);
		user.setUserName("ric");
		userDao.add(user);
	}

	public List getAllUser() {

		return userDao.getAllUser();
	}

	public User getUserById() {
		// TODO Auto-generated method stub
		int id=1;
		return userDao.getUserById(id);
	}


//	public ArrayList<User> query() {
//		// TODO Auto-generated method stub
//		return userDao.query();
//	}

//	public void addTwo(int i) {
//		User user1=new User();
//		user1.setUserId("rock");
//		user1.setUserName("233");
//		userDao.add(user1);
//			try {
//				throw new Exception();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		User user2=new User();
//		user2.setUserId("dd");
//		user2.setUserName("ee");
//		user2.setUserPsw("ee");
//		userDao.add(user2);
//	}

	

}
