package com.zhifou.mapper;

import com.zhifou.domain.UserServiceDTO;
import com.zhifou.provider.UserServiceProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserServiceMapper {
    @SelectProvider(type = UserServiceProvider.class,method="queryUser")
    UserServiceDTO queryUser(UserServiceDTO userServiceDTO);

    @InsertProvider(type = UserServiceProvider.class,method="createUser")
    UserServiceDTO createUser(UserServiceDTO userServiceDTO);
}
