package com.cg.placement.repository;

import com.cg.placement.entities.User;
 public interface IUserRepository{
	public User addNewUser(User user);
	public User updateUser(User user);
	public User login(User user);
	boolean logOut();
	void beginTransaction();
	void commitTransaction();
	

}
