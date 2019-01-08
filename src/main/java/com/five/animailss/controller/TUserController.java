package com.five.animailss.controller;

import com.five.animailss.entity.TUser;
import com.five.animailss.service.TUService;
import com.five.animailss.util.ResultUtil;
import com.five.animailss.vo.ResultBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "这是用户接口文档",value = "接口文档")
@RestController
public class TUserController {
    @Autowired
    TUService tuService;
    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"登录"},value = "获取登录接口")
    @RequestMapping("/login")
    public ResultBean login(@RequestParam(value = "username", required = true)TUser tUser) {
        return tuService.selectByUser(tUser);
    }
}
