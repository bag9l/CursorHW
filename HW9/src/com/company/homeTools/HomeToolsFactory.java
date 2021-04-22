package com.company.homeTools;

import com.company.interfaces.Ax;
import com.company.interfaces.Hammer;
import com.company.interfaces.Shovel;
import com.company.interfaces.ToolsFactory;

public class HomeToolsFactory implements ToolsFactory {
    @Override
    public Hammer getHummer() {
        return new HomeHummer();
    }

    @Override
    public Ax getAx() {
        return new HomeAx();
    }

    @Override
    public Shovel getShovel() {
        return new HomeShovel();
    }
}
