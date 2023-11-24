package org.tfcode.mybatis.domain;

import lombok.Data;

/**
 * @Author: tfcode
 * @Date: 2023/11/23
 * @Description:
 */
@Data
public class Address {
    private Integer id;
    private String province;
    private String city;
    private String country;
}
