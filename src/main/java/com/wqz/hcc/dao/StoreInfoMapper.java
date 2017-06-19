package com.wqz.hcc.dao;

import org.mybatis.spring.annotation.MapperScan;

import com.wqz.hcc.pojo.StoreInfo;

@MapperScan
public interface StoreInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StoreInfo record);

    int insertSelective(StoreInfo record);

    StoreInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StoreInfo record);

    int updateByPrimaryKey(StoreInfo record);
}