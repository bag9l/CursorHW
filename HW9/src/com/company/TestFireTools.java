package com.company;

import com.company.fireTools.FireToolsFactory;
import com.company.interfaces.Ax;
import com.company.interfaces.Hammer;
import com.company.interfaces.Shovel;
import com.company.interfaces.ToolsFactory;

public class TestFireTools {

    public static void main(String[] args) {
        ToolsFactory fireToolsFactory = new FireToolsFactory();
        Hammer fireHummer = fireToolsFactory.getHummer();
        Ax fireAx = fireToolsFactory.getAx();
        Ax fireAx1 = fireToolsFactory.getAx();
        Shovel fireShovel = fireToolsFactory.getShovel();

        fireHummer.hummerKnocks();
        fireAx.axChops();
        fireShovel.shovelDigs();
        fireAx1.axChops();
    }
}
