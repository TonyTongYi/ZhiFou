package com.zhifou.provider;

import com.zhifou.domain.UserServiceDTO;
import java.util.UUID;

public class UserServiceProvider {
    String createUser(UserServiceDTO userServiceDTO){
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO USER VALUES('");
        sb.append(UUID.randomUUID()).append("',");
        sb.append("'").append(userServiceDTO.getUserName()).append("',");
        sb.append("'").append(userServiceDTO.getPassWord()).append("')");
        return sb.toString();
    }
    String queryUser(UserServiceDTO userServiceDTO){
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT FROM USER WHERE USER_NAME='");
        sb.append(userServiceDTO.getUserName());
        sb.append("' AND PWD='");
        sb.append(userServiceDTO.getPassWord());
        sb.append("'");
        return sb.toString();
    }
}
