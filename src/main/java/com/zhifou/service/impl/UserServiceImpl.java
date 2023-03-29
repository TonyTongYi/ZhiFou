package com.zhifou.service.impl;

import com.zhifou.domain.UserServiceDTO;
import com.zhifou.entity.UserEntity;
import com.zhifou.mapper.UserServiceMapper;
import com.zhifou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserServiceMapper userServiceMapper;
    @Override
    public Boolean userLogin(UserServiceDTO user) {
        UserServiceDTO userServiceDTO = userServiceMapper.queryUser(user);
        return userServiceDTO!=null;
    }

    @Override
    public Boolean register(UserServiceDTO user) {
        return null;
    }
}
