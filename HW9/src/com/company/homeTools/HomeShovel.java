package com.company.homeTools;

import com.company.interfaces.Shovel;

public class HomeShovel implements Shovel {
    @Override
    public void shovelDigs() {
        System.out.println("Dig potatoes");
    }
}
