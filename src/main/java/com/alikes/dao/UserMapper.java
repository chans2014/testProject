package com.alikes.dao;

import com.alikes.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * dal层的接口实现,相当bll层
 * **/
public class UserMapper implements  UserMapperInterFace {
    public SqlSession sqlSession;

    public UserMapper() throws IOException {

        //this.sqlSession = sqlSession;
        InputStream inputStream = Resources.getResourceAsStream("mybatisConfig.xml");
        // 构建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 获取sqlSession
        sqlSession = sqlSessionFactory.openSession();
       // this.userMapper=sqlSession.getMapper(UserMapper.class);
    }

    @Override
    public List<User> GetList() {
        return this.sqlSession.selectList("MyMapper.GetList");//使用map xml中定义的sql操作数据库
    }

    @Override
    public User GetUser(int id) {
        return this.sqlSession.selectOne("MyMapper.GetUser",id);
    }

    @Override
    public int InsertUser(User user) {
        int i=this.sqlSession.insert("MyMapper.InsertUser",user);
        this.sqlSession.commit();
        return i;
    }

    @Override
    public int UpdateUser(User user) {

         int i= this.sqlSession.update("MyMapper.UpdateUser",user);
        this.sqlSession.commit();
        return  i;
    }

    @Override
    public int DelUser(int id) {
        int i=this.sqlSession.delete("MyMapper.DelUser",id);
        this.sqlSession.commit();
        return i;
    }
}
