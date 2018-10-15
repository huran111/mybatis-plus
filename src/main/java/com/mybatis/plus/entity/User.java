package com.mybatis.plus.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author huran
 * @Title: User
 * @ProjectName mybatis-plus
 * @Description: TODO
 * @date 2018/10/1511:24
 */
@Data
@Accessors(chain = true)
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
