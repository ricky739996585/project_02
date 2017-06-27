package com.ricky.ssm.dao.impl;


import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.ricky.ssm.dao.IUserDao;
import com.ricky.ssm.model.User;

@Repository("userDaoImpl")
public class UserDaoImpl implements IUserDao{
	@Resource(name="sqlSessionFactory")
	private SqlSessionFactory sqlSessionFactory;
	
	public String name="com.ricky.ssm.dao.IUserDao";
	
	public List getAllUser(){
		SqlSession session=sqlSessionFactory.openSession();
		System.out.println("list---->");
		List list=(List) session.selectList(name+".getAllUser");
		return list ;
	}

	public void add(User user) {
		// TODO Auto-generated method stub
		
	}


	public User getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}
}
