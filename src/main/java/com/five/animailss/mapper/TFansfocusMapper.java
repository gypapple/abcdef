package com.five.animailss.mapper;

import com.five.animailss.entity.TFansfocus;

public interface TFansfocusMapper {
    int deleteByPrimaryKey(Integer fId);

    int insert(TFansfocus record);

    int insertSelective(TFansfocus record);

    TFansfocus selectByPrimaryKey(Integer fId);

    int updateByPrimaryKeySelective(TFansfocus record);

    int updateByPrimaryKey(TFansfocus record);
}