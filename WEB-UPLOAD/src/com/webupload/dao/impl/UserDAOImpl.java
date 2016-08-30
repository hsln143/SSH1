package com.webupload.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jstudy.dao.impl.BaseDAOImpl;
import com.webupload.dao.UserDAO;
import com.webupload.model.UserAccount;

@Repository
public class UserDAOImpl extends BaseDAOImpl implements UserDAO {

	@Override
	public UserAccount getUserByName(String uName) {
		UserAccount ua = new UserAccount();
		List<Integer> uaids = this.getHibernateTemplate().find(
				"SELECT UId FROM UserAccount  WHERE UName = ?", uName);
		if (uaids.size() == 1) {
			ua = this.getHibernateTemplate().get(UserAccount.class,
					uaids.get(0));
		}
		return ua;
	}

	@Override
	public List<UserAccount> getAllUser() {
		return this.getHibernateTemplate().find("FROM UserAccount");
	}
}
