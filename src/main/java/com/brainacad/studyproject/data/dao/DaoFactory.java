package com.brainacad.studyproject.data.dao;

import com.brainacad.studyproject.data.dao.impl.StubDaoFactory;


public abstract class DaoFactory {

    public abstract UserDao getUserDao();

    public static DaoFactory getDaoFactory() {
        return new StubDaoFactory();
    }
}
