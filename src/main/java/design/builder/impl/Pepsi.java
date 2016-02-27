package design.builder.impl;

import design.builder.ColdDrink;

/**
 * Created by Joan do Carmo on 10/11/15.
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}