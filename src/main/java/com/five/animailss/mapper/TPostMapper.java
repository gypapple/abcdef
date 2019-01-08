package com.five.animailss.mapper;

import com.five.animailss.entity.TPost;

public interface TPostMapper {
    int deleteByPrimaryKey(Integer pId);

    int insert(TPost record);

    int insertSelective(TPost record);

    TPost selectByPrimaryKey(Integer pId);

    int updateByPrimaryKeySelective(TPost record);

    int updateByPrimaryKey(TPost record);
}