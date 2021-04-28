package com.khs.pjt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	private static final Logger logger = LoggerFactory.getLogger(lndexController.class);

	/**
	 * 등급 별 page 경로 진입
	 */
	@RequestMapping(value="/page")
	public String page() throws Exception {
		return "/page";
	}
	
	@RequestMapping(value="/user/userPage")
	public String userPage() throws Exception {
		return "/user/userPage";
	}
	
	@RequestMapping(value="/member/memberPage")
	public String memberPage() throws Exception {
		return "/member/memberPage";
	}
	
	@RequestMapping(value="/admin/adminPage")
	public String adminPage() throws Exception {
		return "/admin/adminPage";
	}
}
