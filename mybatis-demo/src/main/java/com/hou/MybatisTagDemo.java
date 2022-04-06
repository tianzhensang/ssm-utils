package com.hou;

import com.hou.mapper.TagMapper;
import com.hou.mapper.UserMapper;
import com.hou.pojo.Tag;
import com.hou.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTagDemo {

    public static void main(String[] args) throws IOException {
        //1.加载配置文件，获得SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        System.out.println("反射是" + User.class);
        //3.执行sql语句
        TagMapper tagMapper = sqlSession.getMapper(TagMapper.class);
        List<Tag> tags = tagMapper.selectAll();
        System.out.println(tags);
        sqlSession.close();
    }
}
