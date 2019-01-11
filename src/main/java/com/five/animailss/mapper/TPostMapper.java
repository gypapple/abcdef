package com.five.animailss.mapper;

import com.five.animailss.entity.TPost;
import com.five.animailss.vo.Vpost;

import java.util.List;
import java.util.Map;

public interface TPostMapper {
    int deleteByPrimaryKey(Integer pId);

    int insert(TPost record);

    int insertSelective(TPost record);

    TPost selectByPrimaryKey(Integer pId);

    int updateByPrimaryKeySelective(TPost record);

    int updateByPrimaryKey(TPost record);

    int updateTCount(TPost tPost);

    List<TPost> selectAll(Map<String,Object> param);

    int selectCount();
    /*List<Vpost> select();*/

    List<TPost> selectByTime();

    List<TPost> selectByCount();

    List<TPost> selectByType(Integer pType);
}