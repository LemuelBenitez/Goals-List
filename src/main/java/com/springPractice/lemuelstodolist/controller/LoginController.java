package com.springPractice.lemuelstodolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

//	@RequestMapping("/")
//	@CrossOrigin(origins = "http://localhost:3000/helloWorld", allowCredentials = "true")
//	public String login(ModelMap model) {
//		String name = getLoggedInUsername(model);
//		model.put("name", name);
//		return "index";
//	}

//	private String getLoggedInUsername(ModelMap model) {
//		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//		return authentication.getName();
//	}

}
