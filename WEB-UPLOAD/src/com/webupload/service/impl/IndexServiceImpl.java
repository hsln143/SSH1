package com.webupload.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.webupload.dao.UserDAO;
import com.webupload.model.UserAccount;
import com.webupload.service.IndexService;

@Service
public class IndexServiceImpl implements IndexService {
	
	@Resource
	private UserDAO userDao;

	@Override
	public boolean login(String uName, String uPassword) {
		boolean tag = false;
		if (uName != null && uPassword != null) {
			UserAccount ua = userDao.getUserByName(uName);
			if (ua != null && ua.getUPassword().equals(uPassword)) {
				tag = true;
			}
		}
		return tag;
	}

	@Override
	public List<UserAccount> getAllUserList() {
		return userDao.getAllUser();
	}
}
