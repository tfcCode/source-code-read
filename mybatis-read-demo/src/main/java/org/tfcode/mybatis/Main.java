package org.tfcode.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.tfcode.mybatis.dao.UserDao;
import org.tfcode.mybatis.domain.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author: tfcode
 * @Date: 2023/11/23
 * @Description:
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取Mapper
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> all = mapper.findAll();
        System.out.println(all);

        sqlSession.close();
        sqlSession.commit();
    }
}
