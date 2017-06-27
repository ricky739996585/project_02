package com.ricky.ssm.dao;

import java.util.ArrayList;
import java.util.List;

import com.ricky.ssm.model.User;

public interface IUserDao {
	public void add(User user);
	
	public List getAllUser();
	
	public User getUserById(Integer userId);
}
