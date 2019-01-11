package com.five.animailss.service.impl;

import com.five.animailss.entity.TPost;
import com.five.animailss.mapper.TPostMapper;
import com.five.animailss.service.TPostService;
import com.five.animailss.util.ResultUtil;
import com.five.animailss.vo.PageBeanVo;
import com.five.animailss.vo.ResultBean;
import com.five.animailss.vo.Vpost;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TPostServiceImpl implements TPostService {

    @Autowired
    private TPostMapper tPostMapper;
    @Override
    public ResultBean modifyCount(TPost tPost) {
        tPostMapper.updateTCount(tPost);
        return ResultUtil.setOK("成功",null);
    }

    @Override
    public PageBeanVo<TPost> queryByPage(Integer page, Integer limit) {
        Map<String,Object> map = new HashMap<>();
        map.put("index",(page-1)*limit);
        map.put("limit",limit);
       /* List<TPost> list = tPostMapper.selectAll();
        PageInfo<TPost> pageInfo = new PageInfo<>(list);*/
        return PageBeanVo.setPage(tPostMapper.selectCount(), tPostMapper.selectAll(map));
    }

    @Override
    public ResultBean queryByPtype(Integer pType) {
        List<TPost> list = tPostMapper.selectByType(pType);
        return ResultUtil.setOK("成功",list);
    }

    @Override
    public ResultBean queryTime() {
        List<TPost> list = tPostMapper.selectByTime();
        return ResultUtil.setOK("成功",list);
    }

    @Override
    public ResultBean queryCount() {
        List<TPost> list = tPostMapper.selectByCount();
        return ResultUtil.setOK("成功",list);
    }

    /*@Override
    public ResultBean query() {
        List<Vpost> list = tPostMapper.select();
        return ResultUtil.setOK("成功",list);
    }*/
}
