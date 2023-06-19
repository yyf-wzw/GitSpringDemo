package com.wzw.service.impl;

import com.wzw.dao.UserDao;
import com.wzw.domain.User;
import com.wzw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public boolean save(User user) {
        userDao.save(user);
        return true;
    }

    public boolean update(User user) {
        userDao.update(user);
        return true;
    }

    public boolean delete(Integer id) {
        userDao.delete(id);
        return true;
    }

    public User getById(Integer id) {
        return userDao.getById(id);
    }


    public List<User> getAll() {
        return userDao.getAll();
    }
}
