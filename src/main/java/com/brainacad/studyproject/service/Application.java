package com.brainacad.studyproject.service;

import com.brainacad.studyproject.data.core.StubDataHolder;
import com.brainacad.studyproject.data.dao.impl.JdbcUserDao;
import com.brainacad.studyproject.data.domain.User;
import com.brainacad.studyproject.gui.view.ViewRouter;
import com.brainacad.studyproject.service.impl.LoginServiceImpl;

import java.awt.*;

public class Application {

    public static void main(String[] args) {

        StubDataHolder.createData();

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewRouter viewRouter = ViewRouter.getInstance();
                viewRouter.start();
            }
        });
    }
}