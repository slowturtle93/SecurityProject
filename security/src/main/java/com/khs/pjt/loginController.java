package com.khs.pjt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {
	
	private static final Logger logger = LoggerFactory.getLogger(lndexController.class);
	
	/**
	 * 로그인 화면 경로 진입
	 */
	@RequestMapping(value="/loginPage")
	public String page() throws Exception {
		return "/loginPage";
	}
	
	/**
	 * 액세스 거부 페이지
	 */
	@RequestMapping(value="/access_denied_page")
	public String accessDeniedPage() throws Exception {
		return "/access_denied_page";
	}

}
