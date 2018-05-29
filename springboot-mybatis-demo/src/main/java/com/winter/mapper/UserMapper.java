package com.winter.mapper;

import com.winter.model.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}