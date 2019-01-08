package com.five.animailss.service;

import com.five.animailss.entity.TUser;
import com.five.animailss.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface TUService {
   ResultBean selectByUser(TUser tUser);
}
