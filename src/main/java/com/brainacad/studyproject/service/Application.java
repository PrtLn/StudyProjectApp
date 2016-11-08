package com.brainacad.studyproject.service;

import com.brainacad.studyproject.data.core.StubDataHolder;
import com.brainacad.studyproject.data.dao.impl.JdbcUserDao;
import com.brainacad.studyproject.data.domain.User;
import com.brainacad.studyproject.service.impl.LoginServiceImpl;

public class Application {

    public static void main(String[] args) {

        JdbcUserDao dao = new JdbcUserDao();
        User admin = dao.getUserByName("admin");
        System.out.println(admin);
    }
}