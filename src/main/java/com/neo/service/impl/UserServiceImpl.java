package com.neo.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.neo.dao.UserDao2;
import com.neo.entity.User;

@Service
public class UserServiceImpl implements com.neo.service.UserService{

    @Autowired
    private UserDao2 userDao2;

    @Override
    public List<User> findAll() {
        return userDao2.findAll();
    }

    @Override
    public User getUser(Integer id) {
        return userDao2.getUser(id);
    }

    @Override
    public void update(User user) {
        userDao2.update(user);
    }

    @Override
    public void insert(User user) {
        userDao2.insert(user);
    }

    @Override
    public void insertAll(List<User> users) {
        userDao2.insertAll(users);
    }

    @Override
    public void remove(Integer id) {
        userDao2.remove(id);
    }

    @Override
    public List<User> findByPage(User user, Pageable pageable) {
        return userDao2.findByPage(user, pageable);
    }


}