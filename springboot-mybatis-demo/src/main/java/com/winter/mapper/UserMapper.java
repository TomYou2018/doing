package com.winter.mapper;

import com.winter.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
    List<User> selectAllUser();
}