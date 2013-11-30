package com.sample.vaadin;

import com.vaadin.Application;
import com.vaadin.ui.*;

public class HelloVaadin extends Application {
    @Override
    public void init() {
        Window mainWindow = new Window("HelloVaadin");
        Label label = new Label("Hello Vaadin user");
        mainWindow.addComponent(label);
        setMainWindow(mainWindow);
    }
}
