package com.jlwb.swagger.controller;

import com.jlwb.swagger.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "用户操作", description = "用户操作")
public class UserController {

    @PostMapping("/save")
    @ApiOperation(value = "添加用户")
    public String save(User user){
        return "保存成功";
    }

    @PutMapping("/update")
    @ApiOperation(value = "更新用户信息")
    public String update(User user){
        return "更新成功";
    }

    @GetMapping("/findAll")
    @ApiOperation(value = "查找所有用于")
    public String findAll(){
        return "查找所有";
    }

    @GetMapping("/findById")
    @ApiOperation(value = "查找单个用户")
    public String findById(Integer id){
        return "查找一个";
    }

    @DeleteMapping("/delete")
    @ApiOperation(value = "删除用户信息")
    public String delete(Integer id){
        return "删除成功";
    }
}
