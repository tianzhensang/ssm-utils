package com.hou.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class TestSlf4j {
    @Test
    public void testSlf4j(){
        log.info("测试Slf4j打印信息中。。。。。。");
        log.error("测试Slf4j打印错误中。。。。。。");
    }
}
