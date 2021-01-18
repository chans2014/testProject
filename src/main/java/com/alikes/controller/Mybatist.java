package com.alikes.controller;

import com.alikes.dao.UserMapper;
import com.alikes.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Mybatist  {
    public UserMapper userMapper;

    //获取数据层对象
    public Mybatist() throws Exception{
        // 读取配置文件
//        InputStream inputStream = Resources.getResourceAsStream("mybatisConfig.xml");
//        // 构建sqlSessionFactory
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        // 获取sqlSession
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        this.userMapper=sqlSession.getMapper(UserMapper.class);
        this.userMapper=new UserMapper();
    }

    public  void  GetList() throws IOException {


        List<User>list= this.userMapper.GetList();
        if (list!=null&&list.size()>0)
        {
            for (User u:list) {
                System.out.println("列表-"+u.getName()+":"+u.getAge());
            }
        }
    }

    public void GetUser(int id)
    {
        User u= this.userMapper.GetUser(id);
        System.out.println("实体："+u.getName());
    }

    public void InsertUser(User user)
    {
        int result= this.userMapper.InsertUser(user);
        if (result>0)
            System.out.println("插入成功");
        else
            System.out.println("插入失败");
    }


    public  void  UpdateUser(User user)
    {
        int result= this.userMapper.UpdateUser(user);
        if (result>0)
            System.out.println("修改成功");
        else
            System.out.println("修改失败");
    }

    public  void DelUser(int id){
        int result= this.userMapper.DelUser(id);
        if (result>0)
            System.out.println("删除成功");
        else
            System.out.println("删除失败");
    }
}
