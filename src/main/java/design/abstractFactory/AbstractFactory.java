package design.abstractFactory;

/**
 * Created by Joan do Carmo on 10/11/15.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}