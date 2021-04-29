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
	 * 사용자가 로그인 시 로그인 정보를 요청합니다.
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
