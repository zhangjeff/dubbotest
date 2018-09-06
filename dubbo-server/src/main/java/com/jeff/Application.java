package com.jeff;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhangying on 2018/9/6.
 */
public class Application {

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}
