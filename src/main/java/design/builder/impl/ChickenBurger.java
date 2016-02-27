package design.builder.impl;

import design.builder.Burger;

/**
 * Created by Joan do Carmo on 10/11/15.
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}