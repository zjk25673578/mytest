package com.test.mytest;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.chenva.users.entity.Users;
import com.chenva.users.service.UsersService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MytestApplicationTests {

    @Autowired
    private UsersService usersService;

    private Users u;
    private Users user;
    private List<Users> users;

    @Before
    public void before() {
        u = new Users();
        u.setUname("aaaa");
        u.setPword("123123");
        u.setRname("测试名称");
        u.setUserType(1);
        u.setSetups(1);
        u.setStatus(1);
        u.setCreatetime(new Date());

        users = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            user = new Users();
            user.setUname("testName" + i);
            user.setPword("123123");
            user.setRname("测试名称" + i);
            user.setUserType(1);
            user.setSetups(1);
            user.setStatus(1);
            user.setCreatetime(new Date());
            users.add(user);
        }
    }

    @Test
    public void save() {
        boolean r = usersService.save(u);
        System.out.println(r);
        System.out.println(123);
    }


}

