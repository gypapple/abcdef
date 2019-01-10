package com.five.animailss.service;

import com.five.animailss.entity.TAnimail;
import com.github.pagehelper.PageInfo;


public interface TAnimailService {
    //查询所有的宠物
    PageInfo<TAnimail> selectAllAnimail(String pageNum, String pageSize);
}
