package com.dao;

import com.entity.User;

public interface UserDao {

    public User getUserById(int uid);
    public User getUserAndCard(int uid);
    public void adduser(User user);
}
