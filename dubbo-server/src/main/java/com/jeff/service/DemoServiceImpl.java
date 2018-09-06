package com.jeff.service;

import com.jeff.api.DemoService;

/**
 * Created by zhangying on 2018/9/6.
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
