package com.neo.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.neo.entity.User;

public interface UserDao2 {
	List<User> findAll();

	User getUser(Integer id);

	void update(User user);

	void insert(User user);

	void insertAll(List<User> users);

	void remove(Integer id);

	List<User> findByPage(User user, Pageable pageable);
}
