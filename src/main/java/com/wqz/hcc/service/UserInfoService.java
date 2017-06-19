package com.wqz.hcc.service;

import org.springframework.web.multipart.MultipartFile;

import com.wqz.hcc.bean.FormatResultBean;

public interface UserInfoService
{
	FormatResultBean accountLogin(String account, String password);
	FormatResultBean accountRegister(String account, String password);
	FormatResultBean infoUpdate(String userId, String nickName, MultipartFile headIcon, 
			String sex, String birthday, String hairdo, String sign);
}
