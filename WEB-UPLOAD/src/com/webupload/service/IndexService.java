package com.webupload.service;

import java.util.List;

import com.webupload.model.UserAccount;

public interface IndexService {
	public boolean login(String uName, String uPassword);
	public List<UserAccount> getAllUserList();
}
