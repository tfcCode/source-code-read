package org.tfcode.mybatis.domain;

import lombok.Data;

/**
 * @Author: tfcode
 * @Date: 2023/11/23
 * @Description:
 */
@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private Address address;
}
