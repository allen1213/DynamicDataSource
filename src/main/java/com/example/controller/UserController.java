package com.example.controller;

import com.example.entity.User;
import com.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2019-08-30
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/query")
    public List<User> query(){
        return userService.selectList(null);
    }

    @RequestMapping("/excel")
    public List<User> excel(HttpServletResponse response, HttpServletRequest request) {
        return userService.selectList(null);
    }
	
}
