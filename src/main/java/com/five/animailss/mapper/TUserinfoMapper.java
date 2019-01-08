package com.five.animailss.mapper;

import com.five.animailss.entity.TUserinfo;

public interface TUserinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUserinfo record);

    int insertSelective(TUserinfo record);

    TUserinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUserinfo record);

    int updateByPrimaryKey(TUserinfo record);
}