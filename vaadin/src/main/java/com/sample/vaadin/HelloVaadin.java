package com.sample.vaadin;

import com.vaadin.Application;
import com.vaadin.ui.*;

public class HelloVaadin extends Application {
    @Override
    public void init() {
        setTheme("mytheme");

        final Window mainWindow = new Window("HelloVaadin");

        HorizontalLayout layout = new HorizontalLayout();
        layout.addComponent(new Label("Hello Vaadin user"));

        Label world = new Label("World");
        world.addStyleName("test-style");
        layout.addComponent(world);

        Button button = new Button("Click me");
        button.addListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                mainWindow.showNotification("Button Clicked");
            }
        });
        layout.addComponent(button);


        mainWindow.addComponent(layout);
        setMainWindow(mainWindow);
    }
}
