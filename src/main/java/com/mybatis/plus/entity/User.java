package com.mybatis.plus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
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
@KeySequence("SEQ_USER")

public class User {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private Long roleId;
}
