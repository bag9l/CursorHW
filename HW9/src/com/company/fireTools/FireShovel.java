package com.company.fireTools;

import com.company.interfaces.Shovel;

public class FireShovel implements Shovel {
    @Override
    public void shovelDigs() {
        System.out.println("Cover the fire with earth");
    }
}
