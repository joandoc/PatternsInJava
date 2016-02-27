package design.prototype;

/**
 * Created by Joan do Carmo on 11/11/15.
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}