package com.five.animailss.controller;

import com.five.animailss.entity.TUser;
import com.five.animailss.service.TUserService;
import com.five.animailss.vo.ResultBean;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animail")
public class TUserController {

    @Autowired
    private TUserService tUserService;

    @PostMapping("/login")
    public ResultBean login(String phone, String password) {

        ResultBean bean = tUserService.login(phone, password);
        if (bean.getCode() == 0) {
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(phone,password);
            subject.getSession().setAttribute("tUser", bean.getCode());
            subject.login(token);
        }
        return bean;
    }

    @PostMapping("/addTUser.do")
    public ResultBean addTUser(TUser tUser) {

        return  tUserService.saveTUser(tUser);
    }

    @PostMapping("/modifyTUser.do")
    public ResultBean midifyTUser(TUser tUser) {

        return tUserService.modifyTuser(tUser);
    }
}
