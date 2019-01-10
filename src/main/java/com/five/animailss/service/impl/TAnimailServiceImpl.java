package com.five.animailss.service.impl;

import com.five.animailss.entity.TAnimail;
import com.five.animailss.mapper.TAnimailMapper;
import com.five.animailss.service.TAnimailService;
import com.five.animailss.vo.ResultBean;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TAnimailServiceImpl implements TAnimailService {
    @Autowired
    TAnimailMapper tAnimailMapper;
    @Override
    public PageInfo<TAnimail> selectAllAnimail(String pageNum, String pageSize) {
        List<TAnimail> TAnimails = tAnimailMapper.selectAllAnimail();
        PageInfo<TAnimail> pageInfo = new PageInfo<TAnimail>(TAnimails);
        return pageInfo;
    }
}
