package design.builder.impl;

import design.builder.ColdDrink;

/**
 * Created by Joan do Carmo on 10/11/15.
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}