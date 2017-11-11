package com.lu.cms.dao;

import com.lu.cms.model.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User selectByUsernameAndPassword(String username,String password);
    
    List<User> selectAllUser();
}