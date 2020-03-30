package com.chenxing.eureka_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllertest {
    @Value("${server.port}")
    String host;
    @RequestMapping("/hello")
    public String test(@RequestParam(value = "name")String name){
        return "我的端口号"+host+",我的名字是："+name;
    }
}
