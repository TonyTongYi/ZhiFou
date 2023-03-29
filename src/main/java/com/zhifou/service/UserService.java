package com.zhifou.service;

import com.zhifou.domain.UserServiceDTO;
import com.zhifou.entity.UserEntity;

public interface UserService {
    public Boolean userLogin(UserServiceDTO user);
    public Boolean register(UserServiceDTO user);
}
