package main.java.view;

import main.java.view.LoginMenu;
import main.java.view.Menu;

public class UserMainMenu implements Menu {
    @Override
    public void show() {
        System.out.println("AHhaaa!!");
    }

    @Override
    public void exit() {
        new LoginMenu().show();
    }
}
