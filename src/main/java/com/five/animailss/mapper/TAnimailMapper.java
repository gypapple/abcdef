package com.five.animailss.mapper;

import com.five.animailss.entity.TAnimail;

import java.util.List;

public interface TAnimailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TAnimail record);

    int insertSelective(TAnimail record);

    TAnimail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TAnimail record);

    int updateByPrimaryKey(TAnimail record);

    List<TAnimail> selectAllAnimail();
}