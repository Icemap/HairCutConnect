package com.wqz.hcc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
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
    
    List<StoreInfo> getStore(
    		@Param("left")Double left, 
    		@Param("right")Double right,
    		@Param("top")Double top, 
    		@Param("bottom")Double bottom);
}