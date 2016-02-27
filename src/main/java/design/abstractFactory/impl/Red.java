package design.abstractFactory.impl;

import design.abstractFactory.Color;

/**
 * Created by Joan do Carmo on 10/11/15.
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}