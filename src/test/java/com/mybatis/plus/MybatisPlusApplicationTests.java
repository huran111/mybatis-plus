package com.mybatis.plus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mybatis.plus.entity.User;
import com.mybatis.plus.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlusApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    /**
     * 插入
     */
    @Test
    public void aInsert() {
        User user = new User();
        user.setAge(23);
        user.setName("胡冉");
        user.setEmail("1345122890@qq.com");
        user.setId(32323L);
        userMapper.insert(user);
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    /**
     * 更新
     */
    @Test
    public void aUpdate() {
        userMapper.updateById(new User().setId(1L).setEmail("ab@c.c").setName("胡冉"));
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    /**
     * 删除
     */
    @Test
    public void bDelete() {
        userMapper.deleteById(1L);
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    /**
     * 查询
     */
    @Test
    public void aSelect() {
        User user = userMapper.selectOne(new QueryWrapper<User>().lambda().eq(User::getId, 2));
        System.out.println(user.toString());
    }
}
