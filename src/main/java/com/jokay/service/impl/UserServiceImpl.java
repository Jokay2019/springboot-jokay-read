package com.jokay.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jokay.entity.User;
import com.jokay.mapper.UserMapper;
import com.jokay.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
