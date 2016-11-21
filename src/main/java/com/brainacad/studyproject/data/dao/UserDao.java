package com.brainacad.studyproject.data.dao;

import com.brainacad.studyproject.data.domain.User;

import java.util.Collection;

public interface UserDao extends CrudDao<User> {

    User getUserByName(String username);
}
