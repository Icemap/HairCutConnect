package com.wqz.hcc.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.wqz.hcc.pojo.BarberInfo;

@MapperScan
public interface BarberInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BarberInfo record);

    int insertSelective(BarberInfo record);

    BarberInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BarberInfo record);

    int updateByPrimaryKey(BarberInfo record);
    
    List<BarberInfo> selectInfo(Integer storeId);
}