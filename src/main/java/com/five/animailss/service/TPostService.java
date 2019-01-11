package com.five.animailss.service;

import com.five.animailss.entity.TPost;
import com.five.animailss.vo.PageBeanVo;
import com.five.animailss.vo.ResultBean;


public interface TPostService {
    ResultBean modifyCount(TPost tPost);
    PageBeanVo<TPost> queryByPage(Integer page, Integer limit);
    ResultBean queryByPtype(Integer pType);
    /*ResultBean query();*/
    ResultBean queryTime();

    ResultBean queryCount();
}
