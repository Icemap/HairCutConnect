package com.wqz.hcc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user_info")
public class UserInfoController
{

	@RequestMapping("/login")
	@ResponseBody
	public Object login()
	{
		return "Hello World!";
	}
}
