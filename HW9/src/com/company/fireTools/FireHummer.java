package com.company.fireTools;

import com.company.interfaces.Hammer;

public class FireHummer implements Hammer {
    @Override
    public void hummerKnocks() {
        System.out.println("Knock out the windows");
    }
}
