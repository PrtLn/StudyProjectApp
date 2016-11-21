package com.brainacad.studyproject.service;

import com.brainacad.studyproject.data.core.StubDataHolder;
import com.brainacad.studyproject.data.dao.impl.JdbcUserDao;
import com.brainacad.studyproject.data.domain.User;
import com.brainacad.studyproject.gui.view.ViewRouter;
import com.brainacad.studyproject.service.impl.LoginServiceImpl;

import java.awt.*;

public class Application {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewRouter.getInstance();
            }
        });
    }
}