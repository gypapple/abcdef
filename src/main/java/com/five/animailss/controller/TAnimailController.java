package com.five.animailss.controller;

import com.five.animailss.entity.TAnimail;
import com.five.animailss.mapper.TAnimailMapper;
import com.five.animailss.service.TAnimailService;
import com.five.animailss.util.ResultUtil;
import com.five.animailss.vo.ResultBean;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animail")
public class TAnimailController {
    @Autowired
    private TAnimailService tAnimailService;

    @GetMapping("/getanimailing")
    public ResultBean orderingList(String pageNum, String pageSize, String token) {
        PageInfo<TAnimail> pageInfo = tAnimailService.selectAllAnimail(pageNum,pageSize);
        return ResultUtil.setOK("成功",pageInfo);
    }
}
