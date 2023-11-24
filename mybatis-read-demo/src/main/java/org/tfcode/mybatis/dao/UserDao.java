package org.tfcode.mybatis.dao;

import org.apache.ibatis.annotations.Param;
import org.tfcode.mybatis.domain.User;

import java.util.List;

/**
 * @Author: tfcode
 * @Date: 2023/11/23
 * @Description:
 */
public interface UserDao {

    List<User> findAll(@Param("age") Integer age, @Param("province") String province);

}
