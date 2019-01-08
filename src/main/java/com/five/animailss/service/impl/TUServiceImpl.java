package com.five.animailss.service.impl;

import com.five.animailss.entity.TUser;
import com.five.animailss.mapper.TUserMapper;
import com.five.animailss.service.TUService;
import com.five.animailss.util.ResultUtil;
import com.five.animailss.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TUServiceImpl implements TUService {
    @Autowired
    TUserMapper tUserMapper;

    @Override
    public ResultBean selectByUser(TUser tUser) {
        TUser tUser1 =  tUserMapper.selectByUser(tUser);

        if (tUser1 != null) {
            return  ResultUtil.setOK("登录成功", tUser1);
        }
        return ResultUtil.setError("登录失败",null);
    }
}
