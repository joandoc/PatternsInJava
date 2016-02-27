package design.factory;

/**
 * Created by Joan do Carmo on 09/11/15.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}