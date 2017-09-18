package com.wqz.hcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.wqz.hcc.service.impl.StoreInfoServiceImpl;

@Controller
@RequestMapping("/storeInfo")
public class StoreInfoController
{
	@Autowired
	StoreInfoServiceImpl storeInfoServiceImpl;
	
	@RequestMapping(value = "/insertStore", params = "POST")
	@ResponseBody
	public Object insertStore(
			@RequestParam(value = "lon",required = true)Double lon, 
			@RequestParam(value = "lat",required = true)Double lat, 
			@RequestParam(value = "bossId",required = true)Integer bossId,
			@RequestParam(value = "shopSign",required = true)String shopSign, 
			@RequestParam(value = "tradeName",required = true)String tradeName, 
			@RequestParam(value = "headIcon",required = true)MultipartFile headIcon)
	{
		return storeInfoServiceImpl.insertStore(lon, lat, bossId,
				shopSign, tradeName, headIcon);
	}
	
	@RequestMapping(value = "/getStore", params = "GET")
	@ResponseBody
	public Object getStore(Double left, Double right,
    		Double top, Double bottom)
	{
		return storeInfoServiceImpl.getStore(left, right, top, bottom);
	}
	
	@RequestMapping(value = "/deleteStore", params = "POST")
	@ResponseBody
	public Object deleteStore(Integer storeId)
	{
		return storeInfoServiceImpl.deleteStore(storeId);
	}
}
