package com.company.fireTools;

import com.company.interfaces.Ax;
import com.company.interfaces.Hammer;
import com.company.interfaces.Shovel;
import com.company.interfaces.ToolsFactory;

public class FireToolsFactory implements ToolsFactory {
    @Override
    public Hammer getHummer() {
        return new FireHummer();
    }

    @Override
    public Ax getAx() {
        return new FireAx();
    }

    @Override
    public Shovel getShovel() {
        return new FireShovel();
    }
}
