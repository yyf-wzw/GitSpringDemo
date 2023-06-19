package com.wzw.service;

import com.wzw.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserService {

    public boolean save(User user);

    public boolean update(User user);

    public boolean delete(Integer id);

    public User getById(Integer id);

    public List<User> getAll();
}
