package com.hou;

import com.hou.mapper.UserMapper;
import com.hou.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisUserDemo {

    public static void main(String[] args) throws IOException {
        //1.加载配置文件，获得SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        System.out.println("反射是" + User.class);
        //3.执行sql语句
        //3.1普通方式
        //List<User> users = sqlSession.selectList("test.selectAll");
        //3.2Mapper映射方式
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectAll();


        System.out.println(users);
        sqlSession.close();
    }
}
