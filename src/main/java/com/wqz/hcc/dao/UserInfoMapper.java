package com.wqz.hcc.dao;

import org.mybatis.spring.annotation.MapperScan;

import com.wqz.hcc.pojo.UserInfo;

@MapperScan
public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}