package com.mybatis.plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mybatis.plus.entity.User;
import com.mybatis.plus.model.MyPage;
import com.mybatis.plus.model.ParamSome;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author huran
 * @Title: UserMapper
 * @ProjectName mybatis-plus
 * @Description: TODO
 * @date 2018/10/1511:25
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    MyPage<User> mySelectPage(@Param("pg")MyPage<User> myPage, @Param("ps")ParamSome paramSome);


}
