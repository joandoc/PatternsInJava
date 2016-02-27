package design.abstractFactory.impl;

import design.abstractFactory.Color;

/**
 * Created by Joan do Carmo on 10/11/15.
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}