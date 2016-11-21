package com.brainacad.studyproject.data.dao.impl;

import com.brainacad.studyproject.data.core.StubDataHolder;
import com.brainacad.studyproject.data.dao.UserDao;
import com.brainacad.studyproject.data.domain.User;

import java.util.Collection;

public class StubUserDao implements UserDao {

    @Override
    public User getUserByName(String username) {
        Collection<User> users = StubDataHolder.getUsers();
        for (User user : users) {
            if (user.getUsername().equals(username)) return user;
        }
        return null;
    }

    @Override
    public Collection<User> getAll() {
        return StubDataHolder.getUsers();
    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public int add(User entity) {
        return 0;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean update(User entity) {
        return false;
    }
}
