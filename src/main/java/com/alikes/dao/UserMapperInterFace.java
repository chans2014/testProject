package com.alikes.dao;

import com.alikes.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 数据层，接口形式
 * **/
public interface UserMapperInterFace {
    public List<User> GetList();
    public User GetUser(@Param("id") int id);
    public  int InsertUser(User user);
    public  int UpdateUser(User user);
    public  int DelUser(int id);
}
