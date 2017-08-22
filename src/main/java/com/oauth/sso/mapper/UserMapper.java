package com.oauth.sso.mapper;

import com.oauth.sso.entity.User;

public interface UserMapper {

    User findByName(String userName);
    User loginUser(String userName,String password);

}
