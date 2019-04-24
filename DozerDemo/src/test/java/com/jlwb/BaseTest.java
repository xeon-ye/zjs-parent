package com.jlwb;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
// web 项目的时候，这里可以模拟ServletContext，加上 WebAppConfiguration 就可以实现
@WebAppConfiguration
public class BaseTest {


    @Before
    public void init() {
        System.out.println("=============================> 测试开始了...");
    }


    @After
    public void after() {
        System.out.println("=============================> 测试结束了...");
    }

}
