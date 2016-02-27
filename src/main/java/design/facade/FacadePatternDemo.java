package design.facade;

/**
 * Created by Joan do Carmo on 11/11/15.
 */
public class FacadePatternDemo {
    public static void main(String[] args) {

    //Facade pattern hides the complexities of the system and provides an interface to the client
    // using which the client can access the system.

    //This pattern involves a single class which provides simplified methods required by client
    // and delegates calls to methods of existing system classes.

        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}