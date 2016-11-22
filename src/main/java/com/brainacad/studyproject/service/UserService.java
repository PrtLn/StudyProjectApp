package com.brainacad.studyproject.service;

import com.brainacad.studyproject.data.domain.User;

import java.util.Collection;

public interface UserService {

    Collection<User> getAllUsers();

    User getUserById(int id);

    int addUser(User user);

    boolean update(User user);

    boolean delete(int id);
}
