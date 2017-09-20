package com.wqz.hcc.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.wqz.hcc.bean.PropConfig;
import com.wqz.hcc.dao.UserInfoMapper;
import com.wqz.hcc.pojo.UserInfo;
import com.wqz.hcc.service.UserInfoService;
import com.wqz.hcc.utils.DateTimeUtils;
import com.wqz.hcc.utils.FileUtils;
import com.wqz.hcc.utils.StreamUtils;

@Service
public class UserInfoServiceImpl implements UserInfoService
{
	@Autowired
	UserInfoMapper userInfoMapper;
	
	@Resource(name = "propConfig")
	PropConfig propConfig;
	
	public UserInfo accountLogin(String account, String password)
	{
		return userInfoMapper.loginAccount(account, password);
	}

	public Boolean accountRegister(String account, String password)
	{
		if(userInfoMapper.getCountAccount(account) != 0)
			return false;
		
		UserInfo record = new UserInfo();
		record.setAccount(account);
		record.setPassword(password);
		return userInfoMapper.insertSelective(record) == 1;
	}

	public Boolean infoUpdate(Integer userId, String nickName, MultipartFile headIcon, String sex,
			String birthday, String hairdo, String sign)
	{
		if(userInfoMapper.selectByPrimaryKey(userId) != null)
			return false;

		UserInfo userInfo = new UserInfo();
		userInfo.setId(userId);
		userInfo.setNickName(nickName);
		userInfo.setSex(sex);
		userInfo.setBirthday(DateTimeUtils.Str2Date(birthday));
		userInfo.setHairdo(hairdo);
		userInfo.setSign(sign);
		
		String path = FileUtils.savePic(StreamUtils.getMultipartFileStream(headIcon),
				DateTimeUtils.date2Str(new Date()), propConfig.getSaveHeadIconPath());
		userInfo.setHeadIcon(propConfig.getGetHeadIconPath() + path);
		return userInfoMapper.updateByPrimaryKeySelective(userInfo) == 1;
	}

}
