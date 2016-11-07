package com.brainacad.studyproject.service;

import com.brainacad.studyproject.data.core.StubDataHolder;
import com.brainacad.studyproject.service.impl.LoginServiceImpl;

public class Application {

    public static void main(String[] args) {

        //System.out.println("Hello!");

        StubDataHolder.createData();
        LoginServiceImpl loginService = new LoginServiceImpl();
            if (loginService.login("user", "user")) {
                System.out.println("Success");
            } else {
                System.out.println("Login failed");
            }
    }
}