package com.wqz.hcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.wqz.hcc.service.impl.UserInfoServiceImpl;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController
{
	@Autowired
	UserInfoServiceImpl userInfoServiceImpl;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	@ResponseBody
	public Object login(String account, String password)
	{
		return userInfoServiceImpl.accountLogin(account, password);
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@ResponseBody
	public Object register(String account, String password)
	{
		return userInfoServiceImpl.accountRegister(account, password);
	}

	@RequestMapping(value = "/infoUpdate", method = RequestMethod.POST)
	@ResponseBody
	public Object infoUpdate(
			@RequestParam(value = "userId",required = true)Integer userId, 
			@RequestParam(value = "nickName",required = true)String nickName,  
			@RequestParam(value = "sex",required = true)String sex,
			@RequestParam(value = "birthday",required = true)String birthday, 
			@RequestParam(value = "hairdo",required = true)String hairdo, 
			@RequestParam(value = "sign",required = true)String sign,
			@RequestParam(value = "headIcon",required = true)MultipartFile headIcon)
	{
		return userInfoServiceImpl.infoUpdate(userId, nickName, 
				headIcon, sex, birthday, hairdo, sign);
	}
}
