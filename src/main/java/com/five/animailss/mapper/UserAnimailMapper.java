package com.five.animailss.mapper;

import com.five.animailss.entity.UserAnimail;

public interface UserAnimailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserAnimail record);

    int insertSelective(UserAnimail record);

    UserAnimail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserAnimail record);

    int updateByPrimaryKey(UserAnimail record);
}