package com.five.animailss.service.impl;

import com.five.animailss.entity.TUser;
import com.five.animailss.mapper.TUserMapper;
import com.five.animailss.service.TUserService;
import com.five.animailss.util.EncrypUtil;
import com.five.animailss.util.ResultUtil;
import com.five.animailss.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class TUserServiceImpl implements TUserService {

    @Autowired
    private TUserMapper tUserMapper;
    @Override
    public ResultBean login(String phone, String password) {
        TUser tUser = null;
        if (phone != null) {
            tUser = tUserMapper.selectByPhone(phone);
        }
        if (Objects.equals(tUser.getPassword(), EncrypUtil.md5Pass(password))) {
            return ResultUtil.setOK("success",tUser);
        }
        return ResultUtil.setError("失败",null);
    }

    @Override
    public ResultBean saveTUser(TUser tUser) {
        tUser.setPassword(EncrypUtil.md5Pass(tUser.getPassword()));
        tUserMapper.insert(tUser);
        return ResultUtil.setOK("成功",null);
    }

    @Override
    public ResultBean modifyTuser(TUser tUser) {

        if (tUserMapper.updateTUser(tUser) >0 ) {
            return   ResultUtil.setOK("成功",null);
        }
        return ResultUtil.setError("失败",null);
    }
}
