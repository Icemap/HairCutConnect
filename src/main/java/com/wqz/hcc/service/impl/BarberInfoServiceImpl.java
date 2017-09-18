package com.wqz.hcc.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.wqz.hcc.bean.PropConfig;
import com.wqz.hcc.dao.BarberInfoMapper;
import com.wqz.hcc.pojo.BarberInfo;
import com.wqz.hcc.service.BarberInfoService;
import com.wqz.hcc.utils.DateTimeUtils;
import com.wqz.hcc.utils.FileUtils;
import com.wqz.hcc.utils.StreamUtils;

@Service
public class BarberInfoServiceImpl implements BarberInfoService
{
	@Autowired
	BarberInfoMapper barberInfoMapper;
	
	@Resource(name = "propConfig")
	PropConfig propConfig;
	
	@Override
	public List<BarberInfo> selectInfo(Integer storeId)
	{
		return barberInfoMapper.selectInfo(storeId);
	}

	@Override
	public Boolean updateBarber(Integer barberId, String nickName, 
			String password, String sign, String goodAt, Integer storeId)
	{
		BarberInfo info = new BarberInfo();
		info.setId(barberId);
		if(nickName != null)
			info.setNickName(nickName);
		if(password != null)
			info.setPassword(password);
		if(sign != null)
			info.setSign(sign);
		if(goodAt != null)
			info.setGoodAt(goodAt);
		if(storeId != null)
			info.setStoreId(storeId);
		return barberInfoMapper.updateByPrimaryKeySelective(info) == 1;
	}

	@Override
	public Boolean updateHeadIcon(Integer barberId, MultipartFile headIcon)
	{
		String path = FileUtils.savePic(StreamUtils.getMultipartFileStream(headIcon),
				DateTimeUtils.date2Str(new Date()), propConfig.getSaveHeadIconPath());
		
		BarberInfo info = new BarberInfo();
		info.setHeadIcon(path);
		return barberInfoMapper.updateByPrimaryKeySelective(info) == 1;
	}

	@Override
	public Boolean insert(String nickName, String account, 
			String password, String sign, String goodAt, 
			Integer storeId, MultipartFile headIcon)
	{
		BarberInfo info = new BarberInfo();
		info.setAccount(account);
		info.setNickName(nickName);
		info.setPassword(password);
		info.setSign(sign);
		info.setGoodAt(goodAt);
		info.setStoreId(storeId);
		String path = FileUtils.savePic(StreamUtils.getMultipartFileStream(headIcon),
				DateTimeUtils.date2Str(new Date()), propConfig.getSaveHeadIconPath());
		info.setHeadIcon(propConfig.getGetHeadIconPath() + path);
		
		return barberInfoMapper.insertSelective(info) == 1;
	}

	@Override
	public Boolean delete(Integer barberId)
	{
		return barberInfoMapper.deleteByPrimaryKey(barberId) == 1;
	}
}
