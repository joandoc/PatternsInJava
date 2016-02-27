package design.abstractFactory.impl;

import design.abstractFactory.Shape;

/**
 * Created by Joan do Carmo on 09/11/15.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}