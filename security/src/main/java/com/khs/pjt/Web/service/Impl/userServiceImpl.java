package com.khs.pjt.Web.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.khs.pjt.Web.dao.UserAuthDAO;
import com.khs.pjt.Web.service.userService;

@Service("userSer")
public class userServiceImpl implements userService{
	
	
	@Resource(name="userAuthDAO")
	private UserAuthDAO userAuthDAO;

	/**
	 * �α��� ���� Ƚ�� ����
	 */
	@Override
	public void countFailure(String username) {
		userAuthDAO.updateFailureCount(username);
	}

	/**
	 * �α��� ���� Ƚ�� ��ȸ
	 */
	@Override
	public int checkFailureCount(String username) {
		return userAuthDAO.checkFailureCount(username);
	}
	
	/**
	 * �α��� ���� ��Ȱ��ȭ
	 */
	@Override
	public void disabledUsername(String username) {
		userAuthDAO.updateDisabled(username);
	}
	
	/**
	 * �α��� ���� Ƚ�� �ʱ�ȭ
	 */
	@Override
	public void resetFailureCnt(String username) {
		userAuthDAO.updateFailureCountReset(username);
	}

	/**
	 * ���� �ð� ������Ʈ
	 */
	@Override
	public void updateAccessDate(String username) {
		userAuthDAO.updateNewAccessDate(username);
	}

}
