package com.jeff;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by zhangying on 2018/9/6.
 */
public class LogTest {
    private static final Logger log = LoggerFactory.getLogger(LogTest.class);

    @Test
    public void testLog() {
        // 测试打印普通日志
        log.info("test infoeee");
        log.warn("warning logTest");
    }

}
