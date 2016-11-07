package com.brainacad.studyproject.data.dao;

import com.brainacad.studyproject.data.domain.User;

public interface UserDao {

    User getUserByName(String username);
}
