package com.wqz.hcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.wqz.hcc.service.impl.BarberInfoServiceImpl;

@Controller
@RequestMapping("/barberInfo")
public class BarberInfoController
{
	@Autowired
	BarberInfoServiceImpl barberInfoServiceImpl;
	
	@RequestMapping(value = "/selectInfo", params = "GET")
	@ResponseBody
	public Object selectInfo(Integer storeId)
	{
		return barberInfoServiceImpl.selectInfo(storeId);
	}
	
	@RequestMapping(value = "/updateBarber", params = "POST")
	@ResponseBody
	public Object updateBarber(Integer barberId, String nickName, 
			String password, String sign, String goodAt, Integer storeId)
	{
		return barberInfoServiceImpl.updateBarber(barberId,
				nickName, password, sign, goodAt, storeId);
	}
	
	@RequestMapping(value = "/updateHeadIcon", params = "POST")
	@ResponseBody
	public Object updateHeadIcon(
			@RequestParam(value = "barberId",required = true)Integer barberId, 
			@RequestParam(value = "headIcon",required = true)MultipartFile headIcon)
	{
		return barberInfoServiceImpl.updateHeadIcon(barberId, headIcon);
	}
}
