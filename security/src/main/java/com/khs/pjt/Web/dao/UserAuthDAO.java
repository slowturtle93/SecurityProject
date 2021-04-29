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
    
    /**
     * �α��� ���� �� �α��� ���� Ƚ�� ����
     * @param username
     */
    public void updateFailureCount(String username) {
		sqlSession.update("userLoginMapper.updateFailureCount", username);
	}
	
    /**
     * �α��� ���� Ƚ�� ��ȸ
     * @param username
     * @return
     */
	public int checkFailureCount(String username) {
		return sqlSession.selectOne("userLoginMapper.checkFailureCount", username);
	}
	
	/**
	 * �α��� ���� ��Ȱ��ȭ
	 * @param username
	 */
	public void updateDisabled(String username) {
		sqlSession.update("userLoginMapper.updateUnenabled", username);
	}
	
	/**
	 * �α��� ���� Ƚ�� �ʱ�ȭ
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
