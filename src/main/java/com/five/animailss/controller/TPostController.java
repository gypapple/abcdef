package com.five.animailss.controller;

import com.five.animailss.service.TPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TPostController {
    @Autowired
    TPostService tPostService;

}
