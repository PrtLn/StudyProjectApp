package com.brainacad.studyproject.gui.view;

import com.brainacad.studyproject.gui.MainFrame;

import javax.swing.*;

import static com.brainacad.studyproject.gui.view.View.LOGIN;

public class ViewRouter {

    private static ViewRouter instance;
    private static ViewFactory viewFactory = ViewFactory.getInstance();

    private JFrame mainFrame;
    private boolean started;

    public ViewRouter() {
        mainFrame = new MainFrame();
    }

    public static ViewRouter getInstance() {
        if (instance == null) {
            instance = new ViewRouter();
        }
        return instance;
    }

    public void switchView(View prev, View next, Object ... params) {
        RefreshableView prevView = viewFactory.getView(prev);
        RefreshableView nextView = viewFactory.getView(next);
        nextView.refresh(params);
        mainFrame.setContentPane(nextView.getContent());
        prevView.getContent().setVisible(false);
        nextView.getContent().setVisible(true);
        mainFrame.setVisible(true);
    }

    public void start() {
        if (!started) {
            mainFrame.setContentPane(viewFactory.getView(LOGIN).getContent());
            mainFrame.setVisible(true);
            started = true;
        }
    }
}
