package design.proxy;

/**
 * Created by Joan do Carmo on 11/11/15.
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {

        //In proxy pattern, a class represents functionality of another class.

        //In proxy pattern, we create object having original object to interface its functionality to outer world.

        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}