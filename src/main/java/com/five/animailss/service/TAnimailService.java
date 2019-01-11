package com.five.animailss.service;

import com.five.animailss.entity.Goods;
import com.five.animailss.entity.TAnimail;
import com.github.pagehelper.PageInfo;

import java.util.List;


public interface TAnimailService {
    //查询所有的宠物
    PageInfo<TAnimail> selectAllAnimailList(String pageNum, String pageSize);
    //根据id查询宠物信息
    TAnimail selectById(Integer id);
    //用户关注某个宠物
    int insertUidAndAnimailId(Integer uid, Integer aid);

}
