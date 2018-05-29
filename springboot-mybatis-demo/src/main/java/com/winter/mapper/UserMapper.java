package com.winter.mapper;

import com.winter.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper //一定要加这个mapper否则会报错，why，待查 https://www.cnblogs.com/JealousGirl/p/bean.html
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    //这个方式我自己加的
    List<User> selectAllUser();
}