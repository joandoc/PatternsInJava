package design.builder.impl;

import design.builder.Packing;

/**
 * Created by Joan do Carmo on 10/11/15.
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}