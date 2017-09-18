package com.wqz.hcc.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.wqz.hcc.pojo.BarberInfo;

public interface BarberInfoService
{
	List<BarberInfo> selectInfo(Integer storeId);
	Boolean updateBarber(Integer barberId, String nickName,
			String password, String sign, String goodAt, Integer storeId);
	Boolean updateHeadIcon(Integer barberId, MultipartFile headIcon);
	Boolean insert(String nickName, String account, String password,  
			String sign, String goodAt, Integer storeId, MultipartFile headIcon);
	Boolean delete(Integer barberId);
}
