package com.mybatis.plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatis.plus.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author huran
 * @Title: UserMapper
 * @ProjectName mybatis-plus
 * @Description: TODO
 * @date 2018/10/1511:25
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
