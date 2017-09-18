package com.wqz.hcc.service;

import org.springframework.web.multipart.MultipartFile;

public interface UserInfoService
{
	Boolean accountLogin(String account, String password);
	Boolean accountRegister(String account, String password);
	Boolean infoUpdate(Integer userId, String nickName, MultipartFile headIcon, 
			String sex, String birthday, String hairdo, String sign);
}
