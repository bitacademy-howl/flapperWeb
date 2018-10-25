package com.flapper.stark.DAO;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flapper.stark.model.UserVO;


@Repository
public class UserDAOImpl implements UserDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("rawtypes")
	@Override
	public List<UserVO> getList() {
		Session session = sessionFactory.openSession();
		
		String hql = "FROM User_Table";
		
		Query query = session.createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<UserVO> userList = query.getResultList();
		
		logger.info("UserServiceImpl List :: " + userList);
		
		return userList;
	}
	
}
