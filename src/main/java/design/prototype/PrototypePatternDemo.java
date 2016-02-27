package design.prototype;

/**
 * Created by Joan do Carmo on 11/11/15.
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {

        //This pattern involves implementing a prototype interface which tells to create a clone of the current object.
        // This pattern is used when creation of object directly is costly. For example, an object is to be
        // created after a costly database operation.

        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
