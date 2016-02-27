package design.builder;

import design.builder.impl.Wrapper;

/**
 * Created by Joan do Carmo on 10/11/15.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}