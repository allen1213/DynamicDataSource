package com.example.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.entity.User;

import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author ${author}
 * @since 2019-08-30
 */
public interface IUserService extends IService<User> {

    List<User> selectAll();
	
}
