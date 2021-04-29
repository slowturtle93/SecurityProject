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
    
    public void updateFailureCount(String username) {
		sqlSession.update("userLoginMapper.updateFailureCount", username);
	}
	
	public int checkFailureCount(String username) {
		return sqlSession.selectOne("userLoginMapper.checkFailureCount", username);
	}
	
	public void updateDisabled(String username) {
		sqlSession.update("userLoginMapper.updateUnenabled", username);
	}

}
