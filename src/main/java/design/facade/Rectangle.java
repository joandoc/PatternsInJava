package design.facade;

/**
 * Created by Joan do Carmo on 11/11/15.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}