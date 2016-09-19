/* COPYRIGHT (C) 2016 LTS. All Rights Reserved. */

package com.lts.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lts.core.dao.UserDao;
import com.lts.core.service.UserService;

/**
 * @author veeru
 *
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	/* (non-Javadoc)
	 * @see com.lts.core.service.UserService#getUser()
	 */
	public String getUser() {
		// TODO Auto-generated method stub
		return userDao.getUser();
	}

}
