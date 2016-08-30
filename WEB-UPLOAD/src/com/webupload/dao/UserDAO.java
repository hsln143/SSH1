package com.webupload.dao;

import java.util.List;

import com.webupload.model.UserAccount;

public interface UserDAO{
	public UserAccount getUserByName(String uName);
	public List<UserAccount> getAllUser();
}
