package com.qctc.activiti.controller;

import com.qctc.activiti.dto.User;
import com.qctc.activiti.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/index")
public class indexController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/add")
    @ResponseBody
    public Object add(){
        User user = new User();
        user.setName("张三");
        user.setEmail("11@qq.com");
        user.setAge(19);
        userMapper.insert(user);
        return user;
    }

    @GetMapping("/getall")
    @ResponseBody
    private Object go(){
        List<User> userList = userMapper.selectList(null);
        return userList;
    }

}
