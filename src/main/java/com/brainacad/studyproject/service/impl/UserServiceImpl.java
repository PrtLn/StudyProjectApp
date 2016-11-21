package com.brainacad.studyproject.service.impl;

import com.brainacad.studyproject.data.dao.DaoFactory;
import com.brainacad.studyproject.data.dao.UserDao;
import com.brainacad.studyproject.data.domain.User;
import com.brainacad.studyproject.service.UserService;

import java.util.Collection;

public class UserServiceImpl implements UserService {

    private UserDao userDao = DaoFactory.getDaoFactory().getUserDao();

    @Override
    public Collection<User> getAllUsers() {
        return userDao.getAll();
    }
}