package com.khs.pjt.Web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.khs.pjt.lndexController;

@Controller
public class loginController {
	
	private static final Logger logger = LoggerFactory.getLogger(lndexController.class);
	
	/**
	 * �α��� ȭ�� ��� ����
	 */
	@RequestMapping(value="/loginPage")
	public String page() throws Exception {
		return "/loginPage";
	}
	
	/**
	 * �׼��� �ź� ������
	 */
	@RequestMapping(value="/access_denied_page")
	public String accessDeniedPage() throws Exception {
		return "/access_denied_page";
	}

}
