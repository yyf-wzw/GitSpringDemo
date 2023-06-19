package com.wzw.service;

import com.wzw.config.SpringConfig;
import com.wzw.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes =SpringConfig.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetById(){
        User byId = userService.getById(1);
        System.out.println(byId);
    }

    @Test
    public void testGetAll(){
        List<User> all = userService.getAll();
        System.out.println(all);
    }
}
