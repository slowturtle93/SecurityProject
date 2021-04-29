package com.khs.pjt.Web.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khs.pjt.Web.vo.CustomUserDetails;

@Repository("userAuthDAO")
public class UserAuthDAO {
	
	@Autowired
    private SqlSessionTemplate sqlSession;
 
	/**
	 * 로그인 정보를 조회합니다.
	 * 
	 * @param username
	 * @return CustomUserDetails
	 */
    public CustomUserDetails getUserById(String username) {
        return sqlSession.selectOne("userLoginMapper.selectUserById", username);
    }
    
    /**
     * 로그인 실패 시 로그인 실패 횟수 증가
     * @param username
     */
    public void updateFailureCount(String username) {
		sqlSession.update("userLoginMapper.updateFailureCount", username);
	}
	
    /**
     * 로그인 실패 횟수 조회
     * @param username
     * @return
     */
	public int checkFailureCount(String username) {
		return sqlSession.selectOne("userLoginMapper.checkFailureCount", username);
	}
	
	/**
	 * 로그인 계정 비활성화
	 * @param username
	 */
	public void updateDisabled(String username) {
		sqlSession.update("userLoginMapper.updateUnenabled", username);
	}
	
	/**
	 * 로그인 실패 횟수 초기화
	 * @param username
	 */
	public void updateFailureCountReset(String username) {
		sqlSession.update("userLoginMapper.updateFailureCountReset", username);
	}

	/**
	 * 
	 * @param username
	 */
	public void updateNewAccessDate(String username) {
		sqlSession.update("userLoginMapper.updateAccessDate", username);
	}

}
