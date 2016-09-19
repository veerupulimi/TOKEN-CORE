/* COPYRIGHT (C) 2016 LTS. All Rights Reserved. */

package com.lts.core.dao.impl;

import org.springframework.stereotype.Repository;

import com.lts.core.dao.UserDao;


/**
 * @author veeru
 *
 */
@Repository("userdao")
public class UserDaoImpl implements UserDao {

	/* (non-Javadoc)
	 * @see com.lts.core.dao.UserDao#getUser()
	 */
	public String getUser() {
		// TODO Auto-generated method stub
		return "VEERANJANEYULU PULIMI";
	}

}
