package com.ping;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liyaoping
 * @version 1.0
 * @date 2021-2-20 9:52
 */
//@RunWith(SpringRunner.class)  //底层用junit  SpringJUnit4ClassRunner
//@SpringBootTest(classes={Example.class})//启动整个springboot工程
public class TestSpringBoot {

    @Test
    public void test1(){
        System.out.println("测试1111");
    }
    @Before
    public void test2(){
        System.out.println("测试before");
    }
    @After
    public void test3(){
        System.out.println("测试after");
    }
}
