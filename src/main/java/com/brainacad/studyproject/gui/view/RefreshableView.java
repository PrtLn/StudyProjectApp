package com.brainacad.studyproject.gui.view;

import javax.swing.*;

public abstract class RefreshableView {

    protected JPanel content = new JPanel();

    public abstract View getName();

    public JPanel getContent() {
        return content;
    }

    public abstract void refresh();
}
