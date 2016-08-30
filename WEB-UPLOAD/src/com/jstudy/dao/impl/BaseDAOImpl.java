package com.jstudy.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.jstudy.dao.BaseDAO;

public class BaseDAOImpl extends HibernateDaoSupport implements BaseDAO {
	
	@Resource
	public void setSessionFactoryOverride(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
}
