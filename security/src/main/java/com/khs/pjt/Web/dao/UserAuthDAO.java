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
	 * �α��� ������ ��ȸ�մϴ�.
	 * 
	 * @param username
	 * @return CustomUserDetails
	 */
    public CustomUserDetails getUserById(String username) {
        return sqlSession.selectOne("userLoginMapper.selectUserById", username);
    }
    
}
