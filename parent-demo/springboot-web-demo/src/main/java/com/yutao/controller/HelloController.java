package com.yutao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: HelloController
 * @Description: springboot+html
 * @Author: Administrator
 * @Date: 2019/10/16 0016 23:09
 * @Version: 1.0
 */
@Controller
@RequestMapping("")
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
}
