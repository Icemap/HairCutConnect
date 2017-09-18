package com.wqz.hcc.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.wqz.hcc.pojo.StoreInfo;

public interface StoreInfoService
{
	Boolean insertStore(Double lon, Double lat, Integer bossId,
			String shopSign, String tradeName, MultipartFile headIcon);
	List<StoreInfo> getStore(Double left, Double right,
    		Double top, Double bottom);
	Boolean deleteStore(Integer storeId);
}
