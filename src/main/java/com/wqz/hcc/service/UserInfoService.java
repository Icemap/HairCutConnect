package com.wqz.hcc.service;

import org.springframework.web.multipart.MultipartFile;

import com.wqz.hcc.pojo.UserInfo;

public interface UserInfoService
{
	UserInfo accountLogin(String account, String password);
	Boolean accountRegister(String account, String password);
	Boolean infoUpdate(Integer userId, String nickName, MultipartFile headIcon, 
			String sex, String birthday, String hairdo, String sign);
}
