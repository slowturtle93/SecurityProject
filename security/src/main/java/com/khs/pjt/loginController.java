package com.khs.pjt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {
	
	private static final Logger logger = LoggerFactory.getLogger(lndexController.class);
	
	@RequestMapping(value="/loginPage")
	public String page() throws Exception {
		return "/loginPage";
	}

}
