package design.builder.impl;

import design.builder.Burger;

/**
 * Created by Joan do Carmo on 10/11/15.
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}