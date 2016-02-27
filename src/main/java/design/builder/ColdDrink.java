package design.builder;

import design.builder.impl.Bottle;

/**
 * Created by Joan do Carmo on 10/11/15.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}