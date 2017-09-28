package Prototype;

/**
 * Created by sourabh on 9/7/16.
 */
public class PrototypeDemo {

    public static PrototypeFactory prototypeFactory = new PrototypeFactory();

    public static void main(String args[]) {
        prototypeFactory.registerShape("rectangle", new Rectangle());
        prototypeFactory.registerShape("circle", new Circle());

        Circle c = (Circle) prototypeFactory.getShape("circle");
        c.draw();
    }
}
