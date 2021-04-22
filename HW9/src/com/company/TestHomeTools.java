package com.company;

import com.company.homeTools.HomeToolsFactory;
import com.company.interfaces.Ax;
import com.company.interfaces.Hammer;
import com.company.interfaces.Shovel;
import com.company.interfaces.ToolsFactory;

public class TestHomeTools {
    public static void main(String[] args) {
        ToolsFactory homeToolsFactory = new HomeToolsFactory();
        Hammer homeHummer = homeToolsFactory.getHummer();
        Ax homeAx = homeToolsFactory.getAx();
        Shovel homeShovel = homeToolsFactory.getShovel();
        Shovel homeShovel1 = homeToolsFactory.getShovel();

        homeAx.axChops();
        homeHummer.hummerKnocks();
        homeShovel.shovelDigs();
        homeShovel1.shovelDigs();
    }
}
