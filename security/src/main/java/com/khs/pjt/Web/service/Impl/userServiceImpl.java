package com.khs.pjt.Web.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.khs.pjt.Web.dao.UserAuthDAO;
import com.khs.pjt.Web.service.userService;

@Service("userSer")
public class userServiceImpl implements userService{
	
	
	@Resource(name="userAuthDAO")
	private UserAuthDAO userAuthDAO;

	@Override
	public void countFailure(String username) {
		userAuthDAO.updateFailureCount(username);
	}

	@Override
	public int checkFailureCount(String username) {
		return userAuthDAO.checkFailureCount(username);
	}

	@Override
	public void disabledUsername(String username) {
		userAuthDAO.updateDisabled(username);
	}

}
