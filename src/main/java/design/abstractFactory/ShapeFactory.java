package design.abstractFactory;

import design.abstractFactory.AbstractFactory;
import design.abstractFactory.Color;
import design.abstractFactory.Shape;
import design.abstractFactory.impl.Circle;
import design.abstractFactory.impl.Rectangle;
import design.abstractFactory.impl.Square;

/**
 * Created by Joan do Carmo on 10/11/15.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){

        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return  new Circle();

        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}