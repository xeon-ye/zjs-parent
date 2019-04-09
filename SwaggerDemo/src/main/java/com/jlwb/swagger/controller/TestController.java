package com.jlwb.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author daxiong
 * 网址 https://blog.csdn.net/Guijun6/article/details/85204040
 */
@RestController
@Api(value = "测试接口", description = "测试接口")
public class TestController {

    @ApiOperation(value = "用户查询", notes = "根据ID查询用户信息")
    @GetMapping(value = "/demo",produces="text/html;charset=UTF-8")
    public String getTest() {


        return "返回测试测试数据";
    }

}
