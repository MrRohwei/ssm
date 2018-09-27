package com.ssm.manager.service.impl;

import com.ssm.manager.mapper.UserMapper;
import com.ssm.manager.pojo.User;
import com.ssm.manager.service.UserService;

import java.util.List;

/**
 * Create with IDEA
 * User:Looveh
 * Date:18/9/27
 * Time:下午3:46
 * Desc:
 */

public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public List<User> getUsers() {
        return userMapper.getUsers();
    }

}
