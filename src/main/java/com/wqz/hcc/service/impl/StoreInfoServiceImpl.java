package com.wqz.hcc.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.wqz.hcc.bean.PropConfig;
import com.wqz.hcc.dao.StoreInfoMapper;
import com.wqz.hcc.pojo.StoreInfo;
import com.wqz.hcc.service.StoreInfoService;
import com.wqz.hcc.utils.DateTimeUtils;
import com.wqz.hcc.utils.FileUtils;
import com.wqz.hcc.utils.StreamUtils;

@Service
public class StoreInfoServiceImpl implements StoreInfoService
{
	@Autowired
	StoreInfoMapper storeInfoMapper;

	@Resource(name = "propConfig")
	PropConfig propConfig;
	
	@Override
	public Boolean insertStore(Double lon, Double lat, Integer bossId,
			String shopSign, String tradeName, MultipartFile headIcon)
	{
		StoreInfo info = new StoreInfo();
		info.setLat(lat);
		info.setLon(lon);
		info.setBossId(bossId);
		info.setShopSign(shopSign);
		info.setTradeName(tradeName);
		
		String path = FileUtils.savePic(StreamUtils.getMultipartFileStream(headIcon),
				DateTimeUtils.date2Str(new Date()), propConfig.getSaveHeadIconPath());
		info.setHeadIcon(propConfig.getGetHeadIconPath() + path);
		
		return storeInfoMapper.insertSelective(info) == 1;
	}

	@Override
	public List<StoreInfo> getStore(Double left, Double right,
    		Double top, Double bottom)
	{
		return storeInfoMapper.getStore(left, right, top, bottom);
	}

	@Override
	public Boolean deleteStore(Integer storeId)
	{
		return storeInfoMapper.deleteByPrimaryKey(storeId) == 1;
	}
}
