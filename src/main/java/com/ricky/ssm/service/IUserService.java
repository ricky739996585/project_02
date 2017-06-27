package com.ricky.ssm.service;

import java.util.ArrayList;
import java.util.List;

import com.ricky.ssm.model.User;


public interface IUserService {
	public void add();
	
	public List getAllUser();
	
	public User getUserById();
	
//	public void addTwo(int i);
}
