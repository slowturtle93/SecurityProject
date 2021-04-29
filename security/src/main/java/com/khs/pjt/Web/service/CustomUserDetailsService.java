package com.khs.pjt.Web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.khs.pjt.Web.dao.UserAuthDAO;
import com.khs.pjt.Web.vo.CustomUserDetails;

public class CustomUserDetailsService implements UserDetailsService{
	
	@Autowired
    private UserAuthDAO userAuthDAO;
 
	/**
	 * ����ڰ� �α��� �� �α��� ������ ��û�մϴ�.
	 *  
	 * param username
	 * return CustomUserDetails
	 */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        CustomUserDetails user = userAuthDAO.getUserById(username);
        if(user == null) {
            throw new InternalAuthenticationServiceException(username);
        }
        return user;
    }
}
