package com.company.homeTools;

import com.company.interfaces.Hammer;

public class HomeHummer implements Hammer {
    @Override
    public void hummerKnocks() {
        System.out.println("Drive nails");
    }
}
