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
	 * 로그인 실패 횟수 증가
	 */
	@Override
	public void countFailure(String username) {
		userAuthDAO.updateFailureCount(username);
	}

	/**
	 * 로그인 실패 횟수 조회
	 */
	@Override
	public int checkFailureCount(String username) {
		return userAuthDAO.checkFailureCount(username);
	}
	
	/**
	 * 로그인 계정 비활성화
	 */
	@Override
	public void disabledUsername(String username) {
		userAuthDAO.updateDisabled(username);
	}
	
	/**
	 * 로그인 실패 횟수 초기화
	 */
	@Override
	public void resetFailureCnt(String username) {
		userAuthDAO.updateFailureCountReset(username);
	}

	/**
	 * 접근 시간 업데이트
	 */
	@Override
	public void updateAccessDate(String username) {
		userAuthDAO.updateNewAccessDate(username);
	}

}
