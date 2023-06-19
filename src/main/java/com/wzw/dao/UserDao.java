package com.wzw.dao;

import com.wzw.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserDao {

    @Insert("insert into user values (null,#{username},#{password},#{value})")
    public void save(User user);

    @Update("update user set username=#{username},password=#{password},value=#{value} where id=#{id}")
    public void update(User user);

    @Delete("delete from user where id=#{id}")
    public void delete(Integer id);

    @Select("select * from user where id=#{id}")
    public User getById(Integer id);

    @Select("select * from user")
    public List<User> getAll();
}
