package org.tfcode.mybatisplus;

import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.tfcode.mybatisplus.dao.UserMapper;
import org.tfcode.mybatisplus.domain.User;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: tfcode
 * @Date: 2023/11/24
 * @Description:
 */
public class MybatisPlusMain {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-plus-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getName, "徐凤年");
        User user = userMapper.selectOne(queryWrapper);
        System.out.println(user);

        sqlSession.commit();
        sqlSession.close();
    }
}
