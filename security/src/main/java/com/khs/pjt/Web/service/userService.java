package com.khs.pjt.Web.service;

public interface userService {
	void countFailure(String username);

	int checkFailureCount(String username);

	void disabledUsername(String username);
	
	void resetFailureCnt(String username);

	void updateAccessDate(String username);

}
