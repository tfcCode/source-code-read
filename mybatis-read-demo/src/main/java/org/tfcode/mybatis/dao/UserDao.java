package org.tfcode.mybatis.dao;

import org.tfcode.mybatis.domain.User;

import java.util.List;

/**
 * @Author: tfcode
 * @Date: 2023/11/23
 * @Description:
 */
public interface UserDao {

    List<User> findAll();

}
