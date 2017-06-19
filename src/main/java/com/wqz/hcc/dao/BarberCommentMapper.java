package com.wqz.hcc.dao;

import org.mybatis.spring.annotation.MapperScan;

import com.wqz.hcc.pojo.BarberComment;

@MapperScan
public interface BarberCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BarberComment record);

    int insertSelective(BarberComment record);

    BarberComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BarberComment record);

    int updateByPrimaryKey(BarberComment record);
}