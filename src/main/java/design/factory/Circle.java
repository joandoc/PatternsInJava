package design.factory;

/**
 * Created by Joan do Carmo on 09/11/15.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}